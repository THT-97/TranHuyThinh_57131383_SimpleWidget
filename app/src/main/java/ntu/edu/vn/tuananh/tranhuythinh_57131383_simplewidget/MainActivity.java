package ntu.edu.vn.tuananh.tranhuythinh_57131383_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtName;   //Ten
    EditText edtDoB;    //Ngay sinh
    RadioGroup rdgGender;   //Gioi tinh
    CheckBox chk1, chk2, chk3, chk4, chk5; //Cac checkbox
    EditText edtOther;  //So thich khac
    Button btnConfirm;  //Xac nhan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvent();
    }

    protected void addViews(){
        edtName = findViewById(R.id.edtName);
        edtDoB = findViewById(R.id.edtDoB);
        rdgGender = findViewById(R.id.rdgGender);
        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);
        chk4 = findViewById(R.id.chk4);
        chk5 = findViewById(R.id.chk5);
        edtOther = findViewById(R.id.edtOther);
        btnConfirm = findViewById(R.id.btnConfirm);
    }

    protected void addEvent(){
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Confirm();
            }
        });
    }

    protected void Confirm(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String appTxt ="";
        appTxt += edtName.getText() + "\n";
        appTxt += "Ngày sinh" + sdf.format(edtDoB.getText()) + "\n";
        switch (rdgGender.getCheckedRadioButtonId()){
            case (R.id.rbM): appTxt += "Giới tính: Nam" + "\n";
                break;
            case (R.id.rbF): appTxt += "Giới tính: Nữ" + "\n";
                break;
        }
        /*text += "Sở thích: ";
        if(chk1.isChecked()) appTxt += chk1.getText() + "; ";
        if(chk2.isChecked()) appTxt += chk2.getText() + "; ";
        if(chk3.isChecked()) appTxt += chk3.getText() + "; ";
        if(chk4.isChecked()) appTxt += chk4.getText() + "; ";
        if(chk5.isChecked()) appTxt += chk5.getText() + "; ";
        text += edtOther.getText();*/
        Toast.makeText(getApplicationContext(), appTxt, Toast.LENGTH_SHORT);
    }
}
