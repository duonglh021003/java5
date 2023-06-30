package com.example.demo.B1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

    public class test extends JFrame {
        private JTextField searchField;
        private JButton searchButton;
        private JTextArea searchResultArea;

        private ArrayList<String> dataList; // danh sách dữ liệu để tìm kiếm

        public SearchApp() {
            setTitle("Search Application");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 300);
            setLocationRelativeTo(null); // center the window

            // Thiết kế giao diện
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            searchField = new JTextField();
            panel.add(searchField, BorderLayout.CENTER);
            searchButton = new JButton("Search");
            panel.add(searchButton, BorderLayout.EAST);
            searchResultArea = new JTextArea();
            JScrollPane scrollPane = new JScrollPane(searchResultArea);
            panel.add(scrollPane, BorderLayout.SOUTH);
            add(panel);

            // Khởi tạo danh sách dữ liệu để tìm kiếm
            dataList = new ArrayList<String>();
            dataList.add("apple");
            dataList.add("banana");
            dataList.add("cherry");
            dataList.add("date");
            dataList.add("elderberry");

            // Thêm ActionListener cho nút tìm kiếm
            searchButton.addActionListener(new SearchButtonListener());
        }

        // Xử lý sự kiện khi người dùng nhấn nút tìm kiếm
        class SearchButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                // Thực hiện quá trình tìm kiếm
                ArrayList<String> results = search(searchText);
                // Hiển thị kết quả tìm kiếm trên JTextArea
                StringBuilder sb = new StringBuilder();
                sb.append("Search results for: " + searchText + "\n");
                for (String result : results) {
                    sb.append(result + "\n");
                }
                searchResultArea.setText(sb.toString());
            }
        }

        // Thực hiện quá trình tìm kiếm
        private ArrayList<String> search(String searchText) {
            ArrayList<String> results = new ArrayList<String>();
            for (String data : dataList) {
                if (data.contains(searchText)) {
                    results.add(data);
                }
            }
            return results;
        }

        public static void main(String[] args) {
            SearchApp app = new SearchApp();
            app.setVisible(true);
        }
    }

