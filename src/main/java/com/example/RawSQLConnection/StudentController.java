package com.example.RawSQLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class StudentController {

    @Autowired
    DbManager db;

    @PostMapping("/insert-info")
    public void insert_info(@RequestBody Student s) throws SQLException {
        db.insert_info(s);
        return;
    }

    @GetMapping("/info")
    public void getInfo() throws SQLException {
        db.getAllStudents();
        return;
    }
}
