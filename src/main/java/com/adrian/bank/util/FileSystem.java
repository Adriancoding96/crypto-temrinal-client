package com.adrian.bank.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


/**
 * The {@code FileSystem} class provides utility methods for working with the file system,
 * including reading file contents, creating files and directories, and checking for their existence.
 * 
 * <p>This class simplifies common file system operations by encapsulating the complexities of
 * file handling into a set of reusable methods. It handles various scenarios, such as ensuring
 * directories exist before creating files and verifying the presence of files or directories.</p>
 * 
 * <h2>Features:</h2>
 * <ul>
 *   <li>Read file content as a {@code String}</li>
 *   <li>Create new files in specified directories</li>
 *   <li>Create new directories at specified paths</li>
 *   <li>Check the existence of files and directories</li>
 * </ul>
 * 
 * <h2>Usage:</h2>
 * <pre>{@code
 * FileSystem fileSystem = new FileSystem();
 * 
 * // Read file content
 * String content = fileSystem.readFileContent("/path/to/file.txt");
 * 
 * // Create a new directory
 * fileSystem.createDirectory("/path/to/new/directory");
 * 
 * // Create a new file
 * fileSystem.createFile("/path/to/new/directory", "newFile.txt");
 * 
 * // Check if a file exists
 * boolean fileExists = fileSystem.fileExisits("/path/to/file.txt");
 * 
 * // Check if a directory exists
 * boolean directoryExists = fileSystem.directoryExists("/path/to/directory");
 * }</pre>
 * 
 * <h2>Exceptions:</h2>
 * <ul>
 *   <li>{@code IOException} is thrown for IO-related issues, such as failing to read a file or create a directory.</li>
 *   <li>{@code RuntimeException} is used for logical errors, such as attempting to create a file in a non-existent directory
 *       or trying to create a file or directory that already exists.</li>
 * </ul>
 * 
 * <p><b>Note:</b> The methods in this class propagate exceptions to the caller to provide flexibility in handling them.</p>
 * 
 * @author adrian.nilsson.coding@gmail.com
 * @version 0.1
 * @since 2025
 */
public class FileSystem {

  /*
   * Reads content of a file and returns it as a String.
   *
   * @param path: contains path to file in String format.
   * @return content: returns content of file as a string.
   * @throws IOException: propogates exception to caller method
   *                      must be handled by caller or propogated
   *                      further.
   *
   * */
  public String readFileContent(String path) throws IOException {
    return Files.readString(Path.of(path));
  }

  /*
   * Creates new file on specified file path.
   *
   * @param path: path to directory that file is to be created in.
   * @param fileName: name of file to be created.
   * @throws IOException: if error occurs during file creation
   *                      error is propagated to calling method.
   * 
   * @throws RuntimeException: if directory does not exists or file
   *                           already exists.
   * */
  public void createFile(String path, String fileName) throws IOException { //TODO Implement custom exeption
    if(!directoryExists(path)) throw new RuntimeException("Provided directory path does not exist");
    if(fileExisits(path + fileName)) throw new RuntimeException("File already exists on path: " + path);
   
    String fullPath = path.concat(fileName);
    File file = new File(fullPath);
    file.createNewFile();
  }

  /*
   * Creates a new directory on the specified file path.
   *
   * @param path: path to directory that directory is to be created in.
   * @throws RuntimeException: throws exeption if directory already exists.
   * @throws IOException: propagates io exception to calling method
   *                      if error occurs during directory creation.
   * */
  public void createDirectory(String path) throws IOException {
    if(directoryExists(path)) throw new RuntimeException("Directory already exists on specified path: " + path);
    File directory = new File(path);
    if(!directory.mkdirs()) throw new IOException("Failed to create directory at path: " + path);
  }


  /*
   * Checks if file exists on file path.
   *
   * @param path: contains file path in string format.
   * @return boolean: returns true if file exists, false if not.
   * */
  public boolean fileExisits(String path) {
    File file = new File(path);
    if(file.exists() && !file.isDirectory()) return true;
    return false;
  }

  /*
   * Checks if directory exists on file path.
   *
   * @param path: contains directory path in string format.
   * @return boolean: returns true if directory exists, false if not.
   * */
  public boolean directoryExists(String path) {
    File file = new File(path);
    if(file.exists() && file.isDirectory()) return true;
    return false;
  }


}
