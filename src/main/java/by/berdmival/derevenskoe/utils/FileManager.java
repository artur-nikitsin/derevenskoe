package by.berdmival.derevenskoe.utils;

import by.berdmival.derevenskoe.entity.product.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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

    public List<String> uploadProductImage(Product product, MultipartFile[] files) throws IOException {
        File productImagesUploadDir = new File(
                this.uploadPath
                .concat(File.separator)
                .concat(Long.toString(product.getId()))
        );
        if (!productImagesUploadDir.exists()) {
            productImagesUploadDir.mkdir();
        }

        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue;
            }

            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + "." + file.getOriginalFilename();
            file.transferTo(new File(productImagesUploadDir.getAbsolutePath() + File.separator + resultFilename));
            product.getPictures().add(resultFilename);
        }
        return product.getPictures();
    }
}
