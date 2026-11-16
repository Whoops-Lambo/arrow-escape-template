package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3649se extends LinearLayout {
    public final Bitmap A00;

    public C3649se(C2055Hi c2055Hi, EnumC3666sv enumC3666sv) {
        super(c2055Hi);
        this.A00 = AbstractC3535qo.A01(EnumC3534qn.AD_CHOICE_ICON);
        c2055Hi.A0F().ABk(enumC3666sv.name().toLowerCase(Locale.US));
        A00();
        setAdChoiceIcon(c2055Hi);
    }

    private void A00() {
        setOrientation(0);
        setPadding(AbstractC3480pv.A0K, AbstractC3480pv.A0K, AbstractC3480pv.A0K, AbstractC3480pv.A0K);
        setClipToPadding(false);
        setGravity(17);
        AbstractC3523qc.A0O(this, -859190839);
        AbstractC3523qc.A0F(AbstractC3480pv.A0D, this);
    }

    private void setAdChoiceIcon(C2055Hi c2055Hi) {
        ImageView imageView = new ImageView(c2055Hi);
        AbstractC3523qc.A0L(imageView);
        imageView.setImageBitmap(this.A00);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, AbstractC3480pv.A0X));
        addView(imageView);
    }
}
