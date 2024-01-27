package com.swingJframe;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        init();


        initMenu();
        this.setVisible(true);
    }

    private void initMenu() {
        //初始化菜单
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();


        //创建菜单上面的两个选项的对象（功能、关于我们）
        JMenu funJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建选项下面的条目对象
        JMenuItem  replayItem = new JMenuItem("重新游戏");
        JMenuItem  reLoginItem = new JMenuItem("重新登录");
        JMenuItem  closeItem = new JMenuItem("关闭游戏");
        JMenuItem  accountItem = new JMenuItem("公众号");

        //设置功能子菜单
        funJMenu.add(replayItem);
        funJMenu.add(reLoginItem);
        funJMenu.add(closeItem);
        //设置关于我们子菜单
        aboutJMenu.add(accountItem);


        jMenuBar.add(funJMenu);
        jMenuBar.add(aboutJMenu);
        this.setJMenuBar(jMenuBar);
    }

    private void init() {
        // 设置宽高
        this.setSize(600, 800);
        // 设置标题
        this.setTitle("拼图游戏 V1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
