package patrycja.wisielec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import patrycja.wisielec.actions.button;
import patrycja.wisielec.generator.generate;
import patrycja.wisielec.images.SetImage;
import patrycja.wisielec.refactoring.refactor;


public class gra extends AppCompatActivity {
    private Integer maxWords = 110;
    private TextView word, endGameText;
    private Button a,a2,b,c,c2,d,e,e2,f,g,h,i,j,k,l,l2,m,n,n2,o,o2,u,p,q,r,s,s2,t,w,x,y,z,z2,z3, start;
    private static generate.WordContainer wordContainer = new generate.WordContainer();
    public ImageView image;
    private LinearLayout allLetters;
    private ImageButton reload;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

    }

    public void GetRawWordsFromFile() throws IOException {
        String str = "";
        InputStream is = getResources().openRawResource(R.raw.words);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            if (is != null) {
                while ((str = reader.readLine()) != null) {
                    generate.WriteStringToContainer(wordContainer, str);
                }
            }
        } finally {
            try {
                is.close();
            } catch (Throwable ignore) {}
        }
    }


    public void buttonClicked(View view) throws FileNotFoundException {
        button.LetterButtonClicked(view, word);
        view.setVisibility(View.INVISIBLE);
        SetImage.SetWisielecImage(image);
        if(refactor.CheckGeuessed()=="true"){
            GameWon();
        } else if(refactor.CheckGeuessed()=="false"){
            GameOver();
        }
    }

    public void startButtonClicked(View view) {
        setContentView(R.layout.gamescreen);
        FindButtons();

        SetAllLettersVisable();
        reload.setVisibility(View.GONE);
        endGameText.setVisibility(View.GONE);
        generate.CreateWordContainer(wordContainer, maxWords);
        try {
            GetRawWordsFromFile();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        button.StartButtonClicked(view, word, image, wordContainer);
    }

    public void endButtonClicked(View view) {
        finish();
        System.exit(0);
    }

    private void GameWon() {
        allLetters.setVisibility(View.GONE);
        endGameText.setVisibility(View.VISIBLE);
        reload.setVisibility(View.VISIBLE);
        endGameText.setText("ZGADŁEŚ");
    }

    private void GameOver() {
        allLetters.setVisibility(View.GONE);
        endGameText.setVisibility(View.VISIBLE);
        reload.setVisibility(View.VISIBLE);
        refactor.SetWord(word);
        endGameText.setText("NIE ZGADŁEŚ");
    }

    public void FindButtons () {
        word = (TextView)findViewById(R.id.word);
        start = (Button)findViewById(R.id.start);
        image = (ImageView)findViewById(R.id.wisielecImage);
        allLetters = (LinearLayout)findViewById(R.id.allLetters);
        endGameText = (TextView)findViewById(R.id.endGameText);
        reload = (ImageButton)findViewById(R.id.reload);

        a = (Button)findViewById(R.id.A);
        a2 = (Button)findViewById(R.id.A2);
        b = (Button)findViewById(R.id.B);
        c = (Button)findViewById(R.id.C);
        c2 = (Button)findViewById(R.id.C2);
        d = (Button)findViewById(R.id.D);
        e = (Button)findViewById(R.id.E);
        e2 = (Button)findViewById(R.id.E2);
        f = (Button)findViewById(R.id.F);
        g = (Button)findViewById(R.id.G);
        h = (Button)findViewById(R.id.H);
        i = (Button)findViewById(R.id.I);
        j = (Button)findViewById(R.id.J);
        k = (Button)findViewById(R.id.K);
        l = (Button)findViewById(R.id.L);
        l2 = (Button)findViewById(R.id.L2);
        m = (Button)findViewById(R.id.M);
        n = (Button)findViewById(R.id.N);
        n2 = (Button)findViewById(R.id.N2);
        o = (Button)findViewById(R.id.O);
        o2 = (Button)findViewById(R.id.O2);
        p = (Button)findViewById(R.id.P);
        q = (Button)findViewById(R.id.Q);
        r = (Button)findViewById(R.id.R);
        s = (Button)findViewById(R.id.S);
        s2 = (Button)findViewById(R.id.S2);
        t = (Button)findViewById(R.id.T);
        u = (Button)findViewById(R.id.U);
        w = (Button)findViewById(R.id.W);
        x = (Button) findViewById(R.id.X);
        y = (Button)findViewById(R.id.Y);
        z = (Button)findViewById(R.id.Z);
        z2 = (Button)findViewById(R.id.Z2);
        z3 = (Button)findViewById(R.id.Z3);
    }

    public void SetAllLettersVisable(){
        allLetters.setVisibility(View.VISIBLE);

        a.setVisibility(View.VISIBLE);
        a2.setVisibility(View.VISIBLE);
        b.setVisibility(View.VISIBLE);
        c.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        d.setVisibility(View.VISIBLE);
        e.setVisibility(View.VISIBLE);
        e2.setVisibility(View.VISIBLE);
        f.setVisibility(View.VISIBLE);
        g.setVisibility(View.VISIBLE);
        h.setVisibility(View.VISIBLE);
        i.setVisibility(View.VISIBLE);
        j.setVisibility(View.VISIBLE);
        k.setVisibility(View.VISIBLE);
        l.setVisibility(View.VISIBLE);
        l2.setVisibility(View.VISIBLE);
        m.setVisibility(View.VISIBLE);
        n.setVisibility(View.VISIBLE);
        n2.setVisibility(View.VISIBLE);
        o.setVisibility(View.VISIBLE);
        o2.setVisibility(View.VISIBLE);
        p.setVisibility(View.VISIBLE);
        q.setVisibility(View.VISIBLE);
        r.setVisibility(View.VISIBLE);
        s.setVisibility(View.VISIBLE);
        s2.setVisibility(View.VISIBLE);
        t.setVisibility(View.VISIBLE);
        u.setVisibility(View.VISIBLE);
        w.setVisibility(View.VISIBLE);
        x.setVisibility(View.VISIBLE);
        y.setVisibility(View.VISIBLE);
        z.setVisibility(View.VISIBLE);
        z2.setVisibility(View.VISIBLE);
        z3.setVisibility(View.VISIBLE);
    }
}
