package patrycja.wisielec.images;

import android.widget.ImageView;

import patrycja.wisielec.R;
import patrycja.wisielec.refactoring.refactor;

public class SetImage {

    public static void SetWisielecImage(ImageView image) {
        Integer mistakes = refactor.GetMistakes();
        switch (mistakes){
            case 0:
                image.setImageResource(R.drawable.w1);
                break;
            case 1:
                image.setImageResource(R.drawable.w2);
                break;
            case 2:
                image.setImageResource(R.drawable.w3);
                break;
            case 3:
                image.setImageResource(R.drawable.w4);
                break;
            case 4:
                image.setImageResource(R.drawable.w5);
                break;
            case 5:
                image.setImageResource(R.drawable.w6);
                break;
            case 6:
                image.setImageResource(R.drawable.w7);
                break;
            case 7:
                image.setImageResource(R.drawable.w8);
                break;
            case 8:
                image.setImageResource(R.drawable.w9);
                break;
            case 10:
                image.setImageResource(R.drawable.w10);
                break;
            case 11:
                image.setImageResource(R.drawable.w11);
                break;
            case 12:
                image.setImageResource(R.drawable.w12);
                break;
            case 13:
                image.setImageResource(R.drawable.w13);
                break;
            case 14:
                image.setImageResource(R.drawable.w14);
                refactor.UpdateGuessed("false");
                break;

            default:
                break;
        }
    }
}
