package by.berdmival.derevenskoe.util;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class FileManager {
    private String uploadPath;

    public FileManager(String uploadPath) {
        this.uploadPath = uploadPath;
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
    }

    private File getUploadDir(String type, String id) {
        return new File(
                this.uploadPath
                        .concat(File.separator)
                        .concat(type)
                        .concat(File.separator)
                        .concat(id)
        );
    }

    public List<String> uploadImage(String type, String id, MultipartFile[] files) throws IOException {
        File productImagesUploadDir = getUploadDir(type, id);
        if (!productImagesUploadDir.exists()) {
            productImagesUploadDir.mkdirs();
        }

        List<String> resultFilenames = new ArrayList<>();
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue;
            }

            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + "_" + file.getOriginalFilename();
            file.transferTo(new File(
                    productImagesUploadDir.getAbsolutePath() +
                            File.separator +
                            resultFilename
            ));
            resultFilenames.add(resultFilename);
        }
        return resultFilenames;
    }

    public Boolean deleteImage(String type, String id, String imageName) throws NoSuchFileException {
        File imageFile = new File(
                getUploadDir(type, id)
                        .getAbsolutePath() +
                        File.separator +
                        imageName
        );
        if (imageFile.exists()) {
            return imageFile.delete();
        } else {
            throw new NoSuchFileException(imageFile.getAbsolutePath());
        }
    }
}
