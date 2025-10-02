package com.example.enhancer.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PackageGenerator {
    public void generatePackage(String code) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output/GeneratedCode.java"))) {
            writer.write(code);
        }
    }
}
