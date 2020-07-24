package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Controller {
    private byte[] fileByteTable;
    @FXML
    private ImageView beforeImage;

    public void loadButton(ActionEvent event) {

        FileChooser fileChoose = new FileChooser();
        fileChoose.setTitle("Choose a file");
        File file = fileChoose.showOpenDialog(null);

        try {
            Path path = Paths.get(file.getPath());
            fileByteTable = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBitmap(ActionEvent event) {
        System.out.println(fileByteTable.length);
    }
}