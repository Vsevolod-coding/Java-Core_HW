package homework_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackUpFiles {
    public static void main(String[] args) {
        String srcDir = ".";
        String backUpDir = "./src/homework_5/backupFolder";

        try {
            startBackUp(srcDir, backUpDir);
        } catch (IOException e) {
            System.out.println("An error occurred while copying files: " + e.getMessage());
        }
    }

    public static void startBackUp(String sourceDir, String backUpDir) throws IOException{
        File srcDir = new File(sourceDir);
        File backupDir = new File(backUpDir);

        if (!backupDir.exists()) {
            boolean dirCreated = backupDir.mkdir();
            if (!dirCreated) {
                throw new IOException("Не удалось создать папку для резервной копии");
            }
        }

        File[] files = srcDir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    Path srcPath = file.toPath();
                    Path destPath = Paths.get(backUpDir, file.getName());

                    Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("File " + file.getName() + " was copied to backup folder.");
                }
            }
        } else {
            System.out.println("The source directory is empty or does not exist.");
        }
    }
}
