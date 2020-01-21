package by.berdmival.derevenskoe.util;

import by.berdmival.derevenskoe.entity.account.Account;
import by.berdmival.derevenskoe.entity.product.Product;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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

    private File getProductImagesUploadDir(Product product) {
        return new File(
                this.uploadPath
                        .concat(File.separator)
                        .concat("product")
                        .concat(File.separator)
                        .concat(Long.toString(product.getId()))
        );
    }

    public Product uploadProductImage(Product product, MultipartFile[] files) throws IOException {
        File productImagesUploadDir = getProductImagesUploadDir(product);
        if (!productImagesUploadDir.exists()) {
            productImagesUploadDir.mkdir();
        }

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
            product.getPictures().add(resultFilename);
        }
        return product;
    }

    public Product deleteProductImage(Product product, String imageName) {
        File imageFile = new File(
                getProductImagesUploadDir(product).getAbsolutePath() +
                        File.separator +
                        imageName
        );
        if (imageFile.exists()) {
            if (imageFile.delete()) {
                product.getPictures().remove(imageName);
            }
        }
        return product;
    }

    private File getUserImagesUploadDir(Account account) {
        return new File(
                this.uploadPath
                        .concat(File.separator)
                        .concat("user")
                        .concat(File.separator)
                        .concat(account.getUsername())
        );
    }

    public Account uploadUserImage(Account account, MultipartFile[] files) throws IOException {
        File userImagesUploadDir = getUserImagesUploadDir(account);
        if (!userImagesUploadDir.exists()) {
            userImagesUploadDir.mkdir();
        }

        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue;
            }

            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + "_" + file.getOriginalFilename();
            file.transferTo(new File(
                    userImagesUploadDir.getAbsolutePath() +
                            File.separator +
                            resultFilename
            ));
            account.setPhotoUri(resultFilename);
        }
        return account;
    }

    public Account deleteUserImage(Account account, String imageName) {
        File imageFile = new File(
                getUserImagesUploadDir(account).getAbsolutePath() +
                        File.separator +
                        imageName
        );
        if (imageFile.exists()) {
            if (imageFile.delete()) {
                account.setPhotoUri("");
            }
        }
        return account;
    }
}
