package com.example.core.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_7, button_8, button_9, button_6, button_5, button_4, button_3, button_2, button_1, button_0, div_button, add_button, sub_button, mull_button, equal_button, clear_button, button_dot;
    private EditText editText;
    float value1, value2;
    boolean addition, subtract, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_9 = (Button) findViewById(R.id.button_9);
        button_8 = (Button) findViewById(R.id.button_8);
        button_7 = (Button) findViewById(R.id.button_7);
        button_6 = (Button) findViewById(R.id.button_6);
        button_5 = (Button) findViewById(R.id.button_5);
        button_4 = (Button) findViewById(R.id.button_4);
        button_3 = (Button) findViewById(R.id.button_3);
        button_2 = (Button) findViewById(R.id.button_2);
        button_1 = (Button) findViewById(R.id.button_1);
        button_0 = (Button) findViewById(R.id.button_0);
        button_dot = (Button) findViewById(R.id.button_dot);
        div_button = (Button) findViewById(R.id.div_button);
        add_button = (Button) findViewById(R.id.add_button);
        sub_button = (Button) findViewById(R.id.sub_button);
        mull_button = (Button) findViewById(R.id.mull_button);
        equal_button = (Button) findViewById(R.id.equal_button);
        clear_button = (Button) findViewById(R.id.clear_button);
        editText = (EditText) findViewById(R.id.editText);
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        add_button.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              if (editText == null) {
                                                  editText.setText("");
                                              } else {
                                                  value1 = Float.parseFloat(editText.getText() +"");
                                                  addition = true;
                                                  editText.setText(null);

                                              }

                                          }
                                      }
        ); add_button.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              if (editText == null) {
                                                  editText.setText("");
                                              } else {
                                                  value1 = Float.parseFloat(editText.getText() +"");
                                                  addition = true;
                                                  editText.setText(null);

                                              }

                                          }
                                      }
        );
        sub_button.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {

                                                  value1 = Float.parseFloat(editText.getText() +"");
                                                  subtract= true;
                                                  editText.setText(null);



                                          }
                                      }
        );
       mull_button.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {

                                                  value1 = Float.parseFloat(editText.getText() +"");
                                                  multiplication = true;
                                                  editText.setText(null);



                                          }
                                      }
        );
       div_button.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {

                                                  value1 = Float.parseFloat(editText.getText() +"");
                                                division = true;
                                                  editText.setText(null);



                                          }
                                      }
        );
        equal_button.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                value2=Float.parseFloat(editText.getText()+"");
                                                        if(addition==true){
                                                            editText.setText(value1+value2 +"");
                                                            addition=false;
                                                        }
                                                        if(subtract==true){
                                                            editText.setText(value1-value2 +"");
                                                           subtract=false;
                                                        }  if(multiplication==true){
                                                            editText.setText(value1*value2 +"");
                                                            multiplication=false;
                                                        }  if(division==true){
                                                            editText.setText(value1/value2 +"");
                                                            division=false;
                                                        }


                                            }
                                        }
        );
     clear_button .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });


    }



}
