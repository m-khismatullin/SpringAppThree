package ru.khismatullin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Take Five";
    }
}
