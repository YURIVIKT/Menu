package ru.exempie.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Object Menu;
    private android.view.Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 // Добавление меню *три точки* в правый угол
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
//---Обработка событий клика на элементах меню---//
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Обработка выбранного элемента меню.
        switch (item.getItemId()){
            case R.id.new_activity:
                newActivity();
                return true;
            case R.id.new_text:
                showText();
                return true;
            case R.id.forward:
                newMenu();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    // метод исполненич клика по элементу - Далее
    private void newActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    // метод исполненич клика по элементу - Здесь
    private void showText() {
        TextView textView = findViewById(R.id.text);
        textView.setText("TextView - без возможности его редактирования");
    }
    // метод исполненич клика по элементу в подменю - Вперед
    private void newMenu() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
// ------------------------ //
}