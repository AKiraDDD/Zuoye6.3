package cn.edu.bistu.cs.se.zuoye63;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {
    PopupMenu popupMenu;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        popupMenu = new PopupMenu(this, findViewById(R.id.popupmenu_btn));
        menu = popupMenu.getMenu();

        // 通过代码添加菜单项
        menu.add(Menu.NONE, Menu.FIRST + 0, 0, "A");
        menu.add(Menu.NONE, Menu.FIRST + 1, 1, "B");

        // 通过XML文件添加菜单项
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_popup, menu);

        // 监听事件
        popupMenu.setOnMenuItemClickListener(new OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.news:
                        Toast.makeText(MainActivity.this, "A",
                                Toast.LENGTH_LONG).show();
                        break;
                    case R.id.open:
                        Toast.makeText(MainActivity.this, "B",
                                Toast.LENGTH_LONG).show();
                        break;
                    case Menu.FIRST + 0:
                        Toast.makeText(MainActivity.this, "C",
                                Toast.LENGTH_LONG).show();
                        break;
                    case Menu.FIRST + 1:
                        Toast.makeText(MainActivity.this, "D",
                                Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }

    public void popupmenu(View v) {
        popupMenu.show();
    }
}