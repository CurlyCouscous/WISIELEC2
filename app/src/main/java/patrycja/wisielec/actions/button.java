package patrycja.wisielec.actions;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;

import patrycja.wisielec.R;
import patrycja.wisielec.generator.generate;
import patrycja.wisielec.refactoring.refactor;

public class button {

    public static void StartButtonClicked(View view, TextView word, ImageView image, generate.WordContainer wordContainer) {
        String generatedText = generate.RandomWord(wordContainer);
        String text = refactor.SetText(generatedText);
        word.setText(text);
        image.setImageResource(R.drawable.w1);
    }

    public static void LetterButtonClicked(View view, TextView word) throws FileNotFoundException {
        switch (view.getId()) {
            case R.id.A:
                word.setText(refactor.CheckText("A"));
                break;
            case R.id.A2:
                word.setText(refactor.CheckText("Ą"));
                break;
            case R.id.B:
                word.setText(refactor.CheckText("B"));
                break;
            case R.id.C:
                word.setText(refactor.CheckText("C"));
                break;
            case R.id.C2:
                word.setText(refactor.CheckText("Ć"));
                break;
            case R.id.D:
                word.setText(refactor.CheckText("D"));
                break;
            case R.id.E:
                word.setText(refactor.CheckText("E"));
                break;
            case R.id.E2:
                word.setText(refactor.CheckText("Ę"));
                break;
            case R.id.F:
                word.setText(refactor.CheckText("F"));
                break;
            case R.id.G:
                word.setText(refactor.CheckText("G"));
                break;
            case R.id.H:
                word.setText(refactor.CheckText("H"));
                break;
            case R.id.I:
                word.setText(refactor.CheckText("I"));
                break;
            case R.id.J:
                word.setText(refactor.CheckText("J"));
                break;
            case R.id.K:
                word.setText(refactor.CheckText("K"));
                break;
            case R.id.L:
                word.setText(refactor.CheckText("L"));
                break;
            case R.id.L2:
                word.setText(refactor.CheckText("Ł"));
                break;
            case R.id.M:
                word.setText(refactor.CheckText("M"));
                break;
            case R.id.N:
                word.setText(refactor.CheckText("N"));
                break;
            case R.id.N2:
                word.setText(refactor.CheckText("Ń"));
                break;
            case R.id.O:
                word.setText(refactor.CheckText("O"));
                break;
            case R.id.O2:
                word.setText(refactor.CheckText("Ó"));
                break;
            case R.id.P:
                word.setText(refactor.CheckText("P"));
                break;
            case R.id.Q:
                word.setText(refactor.CheckText("Q"));
                break;
            case R.id.R:
                word.setText(refactor.CheckText("R"));
                break;
            case R.id.S:
                word.setText(refactor.CheckText("S"));
                break;
            case R.id.S2:
                word.setText(refactor.CheckText("Ś"));
                break;
            case R.id.T:
                word.setText(refactor.CheckText("T"));
                break;
            case R.id.U:
                word.setText(refactor.CheckText("U"));
                break;
            case R.id.W:
                word.setText(refactor.CheckText("W"));
                break;
            case R.id.X:
                word.setText(refactor.CheckText("X"));
                break;
            case R.id.Y:
                word.setText(refactor.CheckText("Y"));
                break;
            case R.id.Z:
                word.setText(refactor.CheckText("Z"));
                break;
            case R.id.Z2:
                word.setText(refactor.CheckText("Ź"));
                break;
            case R.id.Z3:
                word.setText(refactor.CheckText("Ż"));
                break;

            default:
                break;
        }
    }
}
