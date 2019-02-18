package vn.edu.tdc.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    TextView tvView;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnCong,btnTru,btnNhan,btnChia,btnBang;
    ImageButton imgBtn;

    float mValueOne, mValueTwo;

    boolean cong, tru, nhan, chia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        // set control
        setControl();

        // set event
        setEvent();
    }

    // Phương thức set control
    public void setControl() {
        tvView = (TextView) findViewById(R.id.tvView);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnBang = (Button) findViewById(R.id.btnBang);
        imgBtn = (ImageButton) findViewById(R.id.imgBtn);

    }
    public void setEvent() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvView.setText(tvView.getText() + "9");
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvView == null) {
                    tvView.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvView.getText() + "");
                    cong = true;
                    tvView.setText(null);
                }
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(tvView.getText() + "");
                tru = true;
                tvView.setText(null);
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(tvView.getText() + "");
                nhan = true;
                tvView.setText(null);
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(tvView.getText() + "");
                chia = true;
                tvView.setText(null);
            }
        });
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBtn.setImageResource(R.drawable.bang);
            }
        });

        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(tvView.getText() + "");

                if (cong == true) {
                    tvView.setText(mValueOne + mValueTwo + "");
                    cong = false;
                }

                if (tru == true) {
                    tvView.setText(mValueOne - mValueTwo + "");
                    tru = false;
                }

                if (nhan == true) {
                    tvView.setText(mValueOne * mValueTwo + "");
                    nhan = false;
                }

                if (chia == true) {
                    tvView.setText(mValueOne / mValueTwo + "");
                    chia = false;
                }
            }
        });



    }


}
