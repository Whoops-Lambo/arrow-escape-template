package com.mbridge.msdk.widget.adchoice;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.widget.MBImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class LegacyAdChoiceView extends MBImageView implements com.mbridge.msdk.widget.adchoice.a {
    private final Context c;
    private String d;
    private String e;
    private String f;
    private CampaignEx g;
    private com.mbridge.msdk.foundation.feedback.a h;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }

        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements c {
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            LegacyAdChoiceView.this.setImageBitmap(bitmap);
        }
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private boolean a(CampaignEx campaignEx) {
        this.g = campaignEx;
        g gVarE = q63.e(i.b());
        c(campaignEx, gVarE);
        a(campaignEx, gVarE);
        b(campaignEx, gVarE);
        boolean z = (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) ? false : true;
        setImageUrl(this.d);
        return z;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f = adchoice.h();
        }
        if (!TextUtils.isEmpty(this.f) || gVar == null) {
            return;
        }
        this.f = gVar.d();
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.e = adchoice.g();
            }
            if (TextUtils.isEmpty(this.e) && gVar != null) {
                this.e = gVar.c();
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = d.h().g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.h == null) {
            this.h = new a();
        }
        v0.a(this.g, this.h, 4, "");
        return true;
    }

    @Override // com.mbridge.msdk.widget.adchoice.a
    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    @Override // com.mbridge.msdk.widget.adchoice.a
    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.h = aVar;
    }

    public LegacyAdChoiceView(Context context) {
        super(context);
        this.d = "";
        this.e = "";
        this.f = "";
        this.c = context;
        b();
    }

    @Override // com.mbridge.msdk.widget.adchoice.a
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void a() {
        if (this.c != null) {
            q63.d().a(this.d, new b());
        }
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.d = adchoice.f();
        }
        if (!TextUtils.isEmpty(this.d) || gVar == null) {
            return;
        }
        this.d = gVar.b();
    }
}
