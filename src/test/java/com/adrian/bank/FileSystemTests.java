package com.adrian.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.adrian.bank.util.FileSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTests {
  
  private final String TEST_DIRECTORY = "test_dir/";
  private final String TEST_FILE = "test_file.txt";
  private final String TEST_FILE_CONTENT = "Hello, World!";
  private FileSystem fileSystem;

  @BeforeEach
  void setUp() {
    fileSystem = new FileSystem();
    File directory = new File(TEST_DIRECTORY);
    if(!directory.exists()) directory.mkdirs();
  }

  @AfterEach
  void tearDown() {
    File file = new File(TEST_DIRECTORY + TEST_FILE);
    if(file.exists()) file.delete();
    File directory = new File(TEST_DIRECTORY);
    if(directory.exists()) directory.delete();
  }

  @Test
  void readFileContent() throws IOException {
    Path filePath = Paths.get(TEST_DIRECTORY, TEST_FILE);
    Files.writeString(filePath, TEST_FILE_CONTENT);

    String content = fileSystem.readFileContent(TEST_DIRECTORY + TEST_FILE);
    assertEquals(TEST_FILE_CONTENT, content);
  }

  @Test
  void testReadFileContent_FileNotFound() {
    assertThrows(IOException.class, () -> 
      fileSystem.readFileContent(TEST_DIRECTORY + "notimplementedyet.java"),
      "Sould throw IOException if file not found"
      );
  }

  @Test
  void testCreateFile() throws IOException {
    fileSystem.createFile(TEST_DIRECTORY, TEST_FILE);
    File file = new File(TEST_DIRECTORY + TEST_FILE);
    assertTrue(file.exists() && file.isFile(), "File should be created");
  }

  @Test
  void testCreateFile_DirectoryDoesNotExist() {
    assertThrows(RuntimeException.class, () -> 
    fileSystem.createFile("security/", TEST_FILE)
    );
  }
  
}
