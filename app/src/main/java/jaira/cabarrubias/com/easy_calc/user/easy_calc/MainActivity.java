package jaira.cabarrubias.com.easy_calc.user.easy_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnadd;
    private Button btnminus;
    private Button btnmultiply;
    private Button btnclear;
    private Button btndivide;
    private Button btnexit ;
    private EditText mEtFirstNo;
    private EditText mEtSecondNo;
    private TextView mTvResult;

    float result;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        btnadd = (Button) findViewById(R.id.btnadd);
        btnminus = (Button) findViewById(R.id.btnminus);
        btnclear = (Button) findViewById(R.id.btnclear);
        btnmultiply = (Button) findViewById(R.id.btnmultiply);
        btndivide = (Button) findViewById(R.id.btndivide);
        btnexit = (Button) findViewById(R.id.btnexit);
        mEtFirstNo = (EditText) findViewById(R.id.etfirstNo);
        mEtSecondNo = (EditText) findViewById(R.id.etsecondNo);
        mTvResult = (TextView) findViewById(R.id.TvResult);



        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(mEtFirstNo.getText().toString());
                num2 =Integer.parseInt(mEtSecondNo.getText().toString());
                result = num1 + num2;
                mTvResult.setText(String.valueOf(result));

            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(mEtFirstNo.getText().toString());
                num2 =Integer.parseInt(mEtSecondNo.getText().toString());
                result = num1 - num2;
                mTvResult.setText(String.valueOf(result));

            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(mEtFirstNo.getText().toString());
                num2 =Integer.parseInt(mEtSecondNo.getText().toString());
                result = num1 * num2;
                mTvResult.setText(String.valueOf(result));
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(mEtFirstNo.getText().toString());
                num2 =Integer.parseInt(mEtSecondNo.getText().toString());
                result = num1 / num2;
                mTvResult.setText(String.valueOf(result));


            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEtFirstNo.setText(String.valueOf("0"));
                mTvResult.setText(String.valueOf("0"));


            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();


            }
        });

    }


}
