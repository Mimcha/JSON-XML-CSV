package org.example;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Employee max = new Employee();
        List<Employee> employees = max.parseXML("data.xml");
        max.writeJsonToFile(employees, "data2.json");
    }

}