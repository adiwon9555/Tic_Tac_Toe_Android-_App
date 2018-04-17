package com.example.adiwon.tictactoe;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    TextView up;
    TextView down;
    int ch;
    int w;
    String sh;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        up = (TextView) findViewById(R.id.up);
        down = (TextView) findViewById(R.id.down);
        ch = 0;
        w = 0;
        sh = "";
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b1.setText("X");
                    ch = 1;
                    b1.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b1.setText("O");
                        ch = 0;
                        b1.setEnabled(false);
                    }
                }
                check();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b2.setText("X");
                    ch = 1;
                    b2.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b2.setText("O");
                        ch = 0;
                        b2.setEnabled(false);
                    }
                }
                check();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b3.setText("X");
                    ch = 1;
                    b3.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b3.setText("O");
                        ch = 0;
                        b3.setEnabled(false);
                    }
                }
                check();
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b4.setText("X");
                    ch = 1;
                    b4.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b4.setText("O");
                        ch = 0;
                        b4.setEnabled(false);
                    }
                }
                check();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b5.setText("X");
                    ch = 1;
                    b5.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b5.setText("O");
                        ch = 0;
                        b5.setEnabled(false);
                    }
                }
                check();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b6.setText("X");
                    ch = 1;
                    b6.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b6.setText("O");
                        ch = 0;
                        b6.setEnabled(false);
                    }
                }
                check();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b7.setText("X");
                    ch = 1;
                    b7.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b7.setText("O");
                        ch = 0;
                        b7.setEnabled(false);
                    }
                }
                check();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b8.setText("X");
                    ch = 1;
                    b8.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b8.setText("O");
                        ch = 0;
                        b8.setEnabled(false);
                    }
                }
                check();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch == 0) {
                    up.setText("Player 2");
                    down.setText("Player 2");
                    b9.setText("X");
                    ch = 1;
                    b9.setEnabled(false);

                } else {
                    if (ch == 1) {
                        up.setText("Player 1");
                        down.setText("Player 1");
                        b9.setText("O");
                        ch = 0;
                        b9.setEnabled(false);
                    }
                }

                check();
            }
        });

    }

     void check() {

         if (((b1.getText() == "X") && (b1.getText() == b2.getText()) && (b1.getText() == b3.getText())) ||
                 ((b1.getText() == "X") && (b1.getText() == b4.getText()) && (b1.getText() == b7.getText())) ||
                 ((b1.getText() == "X") && (b1.getText() == b5.getText()) && (b1.getText() == b9.getText())) ||
                 ((b4.getText() == "X") && (b4.getText() == b5.getText()) && (b4.getText() == b6.getText())) ||
                 ((b7.getText() == "X") && (b7.getText() == b8.getText()) && (b7.getText() == b9.getText())) ||
                 ((b2.getText() == "X") && (b2.getText() == b5.getText()) && (b2.getText() == b8.getText())) ||
                 ((b3.getText() == "X") && (b3.getText() == b6.getText()) && (b3.getText() == b9.getText())) ||
                 ((b3.getText() == "X") && (b3.getText() == b5.getText()) && (b3.getText() == b7.getText()))) {
             w = 1;

             sh = "Player 1 won (X)";
             Vibrator vibrator= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
             vibrator.vibrate(500);
             b1.setEnabled(false);
             b2.setEnabled(false);
             b3.setEnabled(false);
             b4.setEnabled(false);
             b5.setEnabled(false);
             b6.setEnabled(false);
             b7.setEnabled(false);
             b8.setEnabled(false);
             b9.setEnabled(false);




         } else {
             if (((b1.getText() == "O") && (b1.getText() == b2.getText()) && (b1.getText() == b3.getText())) ||
                     ((b1.getText() == "O") && (b1.getText() == b4.getText()) && (b1.getText() == b7.getText())) ||
                     ((b1.getText() == "O") && (b1.getText() == b5.getText()) && (b1.getText() == b9.getText())) ||
                     ((b4.getText() == "O") && (b4.getText() == b5.getText()) && (b4.getText() == b6.getText())) ||
                     ((b7.getText() == "O") && (b7.getText() == b8.getText()) && (b7.getText() == b9.getText())) ||
                     ((b2.getText() == "O") && (b2.getText() == b5.getText()) && (b2.getText() == b8.getText())) ||
                     ((b3.getText() == "O") && (b3.getText() == b6.getText()) && (b3.getText() == b9.getText())) ||
                     ((b3.getText() == "O") && (b3.getText() == b5.getText()) && (b3.getText() == b7.getText()))) {
                 w = 2;
                 sh = "Player 2  won (0)";
                 Vibrator vibrator= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                 vibrator.vibrate(500);
                 b1.setEnabled(false);
                 b2.setEnabled(false);
                 b3.setEnabled(false);
                 b4.setEnabled(false);
                 b5.setEnabled(false);
                 b6.setEnabled(false);
                 b7.setEnabled(false);
                 b8.setEnabled(false);
                 b9.setEnabled(false);



             } else {
                 if (b1.isEnabled() == false &&
                         b2.isEnabled() == false &&
                         b3.isEnabled() == false &&
                         b4.isEnabled() == false &&
                         b5.isEnabled() == false &&
                         b6.isEnabled() == false &&
                         b7.isEnabled() == false &&
                         b8.isEnabled() == false &&
                         b9.isEnabled() == false
                         ) {
                     Vibrator vibrator= (Vibrator) getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                     vibrator.vibrate(500);
                     ch = 3;
                     w=3;
                     sh = "Match Draw";


                 }
             }
         }

         if(w==1|| w==2||w==3)
         {
             AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
             alertDialog.setTitle(sh + "\n Lets have another match");
             alertDialog.setCancelable(false).setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {

                     Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                     startActivity(intent);
                     finish();



                 }
             }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     dialog.cancel();
                     finish();

                 }
             });
             AlertDialog al=alertDialog.create();
             al.show();
         }



     }
}
