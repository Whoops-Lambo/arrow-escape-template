package com.adsurge.adn.p036k1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p068y0.c;
import com.adsurge.adn.p068y0.d;
import com.adsurge.adn.x1.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class v extends c {
    public static Bitmap Q;
    public static Bitmap R;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements i.e {
        @Override // com.adsurge.adn.l0.i.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a() {
            return new v();
        }
    }

    public final Bitmap T() {
        if (Q == null) {
            Q = n.a("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAAXNSR0IArs4c6QAAAyJJREFUeF7tmet1FDEMhaUOoAKSDkIHpAOoAFIBUAFJBYEKCBVAB6QDtgPSAduBmJtj79F4PfY8PLGzI//Zc3bnYX2+kq69TBsfvPH4yQCYAjZOwFJg4wKwImgpYCmwcQKWAhsXgHUBSwFLgY0TsBQoJQAR+UpEH7vnXTPzzZjnisgHXMfMd2OuX+OaYgoQEVETTELoYL0gou9E9Nbdc1ULQkkAWMX3OQgickZEv4kIn37cMPP10AqvqZRiADD5LrgkBBG5IKKfQfC4dRCACx5qwRidXmPTpSiAFAS38n8HJjYWAG7/zMyoN0VGcQAZCCh6WM2HLv93qgbkUkAra09Er5kZz1g8VgGQgYDCh+AB44uLoAcgzHlXNP+o1Llj5qvF0aMDLX2Im9xtkNeQ6S5VE7qmgaJ3BCDI+YPcReSNK55+yuclVFACwCciAgA9INPLFAQRgRJQEHtFMACA3w6Bigi6B0D07lmyiCUA6JWcCsHXhDAFdKDfmBmQ0WW0Ch6Y+XxJ8Li3NIAfXSpoV7eHCkYUxjPtA4JAoSaoAJ+A8I+IYKR66pgLojSAKdUcc37s66gjPkAfiIigZXqzhHS6dwC0Ot4x86+5wa+hgCSAlBLCIIICerDKwfeLPcGTKkCtbtY2J7pEtHvMVUEVAGOUcPIAchBEBC3S7xa1H/DbbjzieaaAluuQWQr8wLMpgshttEI90K+PfLuIoLffZ8wSfMItM79U9aPpNjhUi46k6nIcJ0g5x3ihvIR2j80YoZgVjoHo7eVVkcvaZrX6ui4cHOLcDlDKB8CVoTC9ikwERkaf/MC0oKfvE1U+2iIj5wltbIZS9CNnf7gc9eAysx0eguD3Du1sh8fIL1htDyF5IBLpDjgEwRYbEFA82z4QiVjbVK2IWmgFAcECwOOGqORY7ASnTGbmoSi2wLs1gi9SBKcAcO5v8rH41HdMuf5JFaDa2en9MTKFugJxOn+NzQHQwj1VUqCFwP0cDEBLq1FjLqaAGtRbeqcpoKXVqDEXU0AN6i290xTQ0mrUmIspoAb1lt5pCmhpNWrMxRRQg3pL7/wP+8rqUKkqepsAAAAASUVORK5CYII=");
        }
        return Q;
    }

    public final Bitmap U() {
        if (R == null) {
            R = n.a("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAAAXNSR0IArs4c6QAAAqBJREFUeF7tWdFRwzAMlTaACaAbwAawAUwATABMAEwATACdADaADegGdAO6gcjjkpwwcZJWaVpj6ad3uciRnt+TZJcpc+PM8ycHwBmQOQIugcwJ4EXQJeASyBwBl0DmBPAu4BJwCWSOgEtgkwQQkXN8n5mfNxXHRhggIjtE9EREJ2XiF5sCYXQARGSfiN6ICL+V3THzbYwF62TKqACIyAERvQTJI+8oAGXyYAvsgZmvh5TLaACIyCUSiATfFwC4XzNzbJ2lsRkFABEBvW9UdPNC/zNVA7okgCJ5VvoviOiQmbGG2dYKQEOxQ8AI/Lj4RQeoQPkFQKj5cp0PJZ1pAcBPB7GaGYAyOFByryEYaB4Vv7JXIkLFXwSsqAEINF/TXUSOyuJZrTUZggVDAHBFRPc9diLcZS2LGABYtk5URNA9AERr4ewRS/3KEACE+g6/D80iwV+FK8YAOAeJPhaMAch4rlkwZ+bJMsk2vTs0ANNCp+FUNwPlw493AKAThS9Y8LNG0U2+lKzMMhgagNZqrkFoA6BM9FMVvWNmfm9gxykzo66sbNsMgG599ahcTJL6uXkm2GYAYkWy8fmqFHAAVkWu8uvScmz9Lj8RwZmhOi3qeQDdBGM17F9LIMki2NQG0a//zO3LtEFm3lWM2+o2GGP8H6p2AIC5H2M0rJ77RQSSgDRgWzMIjTkK67owyIFoiC6Aw07sMIRbH33zs+xhSJ8RwAgwozLzFIiFzAC0dZEsjsN92mi2FyLB7N9WK/73lZhqYdZL0d6HrT7MXHsNaAoi62txxYR8/xgJ6kKef4311ecY7611DhgjAes3HAArgqn7OwNS30Fr/M4AK4Kp+zsDUt9Ba/zOACuCqfs7A1LfQWv8zgArgqn7OwNS30Fr/N9BQqZQp/JPFAAAAABJRU5ErkJggg==");
        }
        return R;
    }

    @Override // com.adsurge.adn.p068y0.a, com.adsurge.adn.p038l0.i
    public boolean a(String str, h hVar) {
        str.getClass();
        if (!str.equals("volume")) {
            return super.a(str, hVar);
        }
        int iE = hVar.e(new JSONObject[0]);
        ImageView imageView = (ImageView) C();
        if (iE <= 0) {
            imageView.setImageBitmap(T());
            return true;
        }
        imageView.setImageBitmap(U());
        return true;
    }

    @Override // com.adsurge.adn.p068y0.c, com.adsurge.adn.p038l0.i
    /* JADX INFO: renamed from: c */
    public d b(com.adsurge.adn.p011c0.a aVar) {
        d dVarB = super.b(aVar);
        dVarB.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return dVarB;
    }

    @Override // com.adsurge.adn.p038l0.i, com.adsurge.adn.p064w0.a
    public void a(String str, JSONObject jSONObject) {
        super.a(str, jSONObject);
        str.getClass();
        if ((str.equals("closeVideo") || str.equals("closeVideoAuto")) && C() != null) {
            ((d) C()).setVisibility(8);
        }
    }
}
