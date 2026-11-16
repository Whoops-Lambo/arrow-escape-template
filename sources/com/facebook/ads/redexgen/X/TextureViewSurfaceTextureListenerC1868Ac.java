package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class TextureViewSurfaceTextureListenerC1868Ac extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC2676cg, InterfaceC2647cD, InterfaceC2674ce {
    public static byte[] A0O;
    public static String[] A0P = {"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    public static final String A0Q;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public C2055Hi A0A;
    public EnumC2761e4 A0B;
    public C2673cd A0C;
    public EnumC2646cC A0D;
    public EnumC2646cC A0E;
    public InterfaceC2645cB A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0O = new byte[]{84, 99, 99, 126, 99, 49, 120, 127, 49, 84, 105, 126, 65, 125, 112, 104, 116, 99, 49, 117, 100, 116, 49, 101, 126, 49, 126, 127, 66, 100, 99, 119, 112, 114, 116, 69, 116, 105, 101, 100, 99, 116, 85, 116, 98, 101, 99, 126, 104, 116, 117, 49, 117, 100, 99, 120, 127, 118, 49, 98, 116, 101, 71, 120, 117, 116, 126, 66, 100, 99, 119, 112, 114, 116, 49, 78, 115, 100, 91, 103, 106, 114, 110, 121, 43, 110, 121, 121, 100, 121, 43, 127, 121, 98, 108, 108, 110, 121, 110, 111, 43, 105, 114, 43, 100, 101, 88, 126, 121, 109, 106, 104, 110, 95, 110, 115, 127, 126, 121, 110, 79, 110, 120, 127, 121, 100, 114, 110, 111, 43, 111, 126, 121, 98, 101, 108, 43, 123, 106, 126, 120, 110, 43, 48, 24, 24, 16, 27, 18, 87, 22, 27, 0, 22, 14, 4, 87, 3, 31, 5, 24, 0, 87, 22, 25, 87, 18, 15, 20, 18, 7, 3, 30, 24, 25, 87, 0, 30, 3, 31, 87, 4, 18, 3, 53, 22, 20, 28, 16, 5, 24, 2, 25, 19, 51, 5, 22, 0, 22, 21, 27, 18, 87, 24, 25, 87, 57, 24, 2, 16, 22, 3, 87, 22, 21, 24, 1, 18, 89, 87, 4, 24, 87, 0, 18, 87, 4, 30, 27, 18, 25, 3, 27, 14, 87, 30, 16, 25, 24, 5, 18, 87, 30, 3, 89, 127, 87, 87, 95, 84, 93, 24, 89, 84, 79, 89, 65, 75, 24, 76, 80, 74, 87, 79, 24, 89, 86, 24, 93, 64, 91, 93, 72, 76, 81, 87, 86, 24, 79, 81, 76, 80, 24, 75, 93, 76, 126, 87, 74, 93, 95, 74, 87, 77, 86, 92, 24, 87, 86, 24, 118, 87, 77, 95, 89, 76, 24, 89, 90, 87, 78, 93, 22, 24, 75, 87, 24, 79, 93, 24, 75, 81, 84, 93, 86, 76, 84, 65, 24, 81, 95, 86, 87, 74, 93, 24, 81, 76, 22, 51, 12, 1, 0, 10, 69, 22, 17, 4, 17, 0, 69, 6, 13, 4, 11, 2, 0, 1, 69, 17, 10, 69, 46, 44, 39, 44, 59, 32, 42};
        String[] strArr = A0P;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (C3300mv.A20(this.A0A) && this.A0D != EnumC2646cC.A08) {
            if (!this.A0L) {
                this.A0L = true;
                this.A0A.A0F().AKH();
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            if (this.A0F != null) {
                this.A0F.AF1(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0Q = TextureViewSurfaceTextureListenerC1868Ac.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC1868Ac(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A0D = EnumC2646cC.A04;
        this.A0E = EnumC2646cC.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC2761e4.A04;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c2055Hi;
    }

    public TextureViewSurfaceTextureListenerC1868Ac(C2055Hi c2055Hi, AttributeSet attributeSet) {
        super(c2055Hi, attributeSet);
        this.A0D = EnumC2646cC.A04;
        this.A0E = EnumC2646cC.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC2761e4.A04;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c2055Hi;
    }

    public TextureViewSurfaceTextureListenerC1868Ac(C2055Hi c2055Hi, AttributeSet attributeSet, int i) {
        super(c2055Hi, attributeSet, i);
        this.A0D = EnumC2646cC.A04;
        this.A0E = EnumC2646cC.A04;
        this.A0M = false;
        this.A0N = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC2761e4.A04;
        this.A0K = false;
        this.A0L = false;
        this.A0A = c2055Hi;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    private void A04() {
        this.A0C = new C2673cd(this.A0A);
        this.A0C.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            Activity activityA0E = this.A0A.A0E();
            if (A0P[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[4] = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t";
            strArr[6] = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW";
            if (activityA0E != null) {
                this.A09 = new MediaController(activityA0E);
                this.A09.setAnchorView(this.A08 == null ? this : this.A08);
                this.A09.setMediaPlayer(new C2656cM(this));
                this.A09.setEnabled(true);
            } else {
                this.A09 = null;
            }
        }
        String str = this.A0G;
        String[] strArr2 = A0P;
        if (strArr2[4].charAt(4) != strArr2[6].charAt(4)) {
            A0P[1] = "7OzxCvlMe7OewOex";
            if (str != null) {
                if (this.A0G.length() != 0 || this.A0K) {
                }
            }
            setVideoState(EnumC2646cC.A08);
            if (isAvailable()) {
                onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
            }
        }
        String[] strArr3 = A0P;
        strArr3[4] = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ";
        strArr3[6] = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu";
        if (str != null) {
            if (this.A0G.length() != 0) {
            }
        }
        setVideoState(EnumC2646cC.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
        this.A0C.A0F(this.A0A.A02(), this.A06);
        setVideoState(EnumC2646cC.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        if (this.A0C == null) {
            return;
        }
        C2675cf c2675cfA08 = this.A0C.A08();
        String[] strArr = A0P;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (c2675cfA08 != null) {
            A08(c2675cfA08.A01, c2675cfA08.A00);
        }
    }

    private void A06() {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
        }
        if (this.A0C != null) {
            this.A0C.A09();
            if (A0P[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0P;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0N = false;
        setVideoState(EnumC2646cC.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C2673cd.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0E();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        AAH();
        if (A0P[1].length() == 30) {
            throw new RuntimeException();
        }
        String[] strArr = A0P;
        strArr[3] = "ibP83lPIHp18E6DzSXuO582r7E";
        strArr[0] = "bqS8XhAkEDMP7WptTe4caNAUJi";
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final void AAH() {
        if (!this.A0H) {
            AI4(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final boolean AAU() {
        return this.A0C != null && this.A0C.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final boolean AAV() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final boolean ABK() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2676cg
    public final void AGQ(String str, Exception exc) {
        this.A0A.A0F().ADN(str);
        this.A0A.A0F().A45(1);
        setVideoState(EnumC2646cC.A03);
        this.A0A.A08().ABz(A03(362, 7, 13), AbstractC3223lf.A1N, new C3224lg(exc));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2676cg
    public final void AGR(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        switch (i) {
            case 1:
                setVideoState(EnumC2646cC.A04);
                return;
            case 2:
                A05();
                if (this.A01 < 0) {
                    return;
                }
                int i2 = this.A01;
                this.A01 = -1;
                InterfaceC2645cB interfaceC2645cB = this.A0F;
                String[] strArr = A0P;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int seekFrom = str2.length();
                if (length == seekFrom) {
                    throw new RuntimeException();
                }
                A0P[1] = "rrPXv2FoHSgfFGcrQjG2fRVM";
                if (interfaceC2645cB == null) {
                    return;
                }
                InterfaceC2645cB interfaceC2645cB2 = this.A0F;
                int seekFrom2 = getCurrentPosition();
                interfaceC2645cB2.AGy(i2, seekFrom2);
                return;
            case 3:
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                if (this.A05 > 0 && this.A05 < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z && this.A0N) {
                    setVideoState(EnumC2646cC.A05);
                    return;
                }
                if (z || this.A0D == EnumC2646cC.A06) {
                    return;
                }
                setVideoState(EnumC2646cC.A07);
                if (this.A0E != EnumC2646cC.A0A) {
                    return;
                }
                ALO(this.A0B, 8);
                this.A0E = EnumC2646cC.A04;
                return;
            case 4:
                if (z) {
                    setVideoState(EnumC2646cC.A06);
                }
                if (this.A0C != null) {
                    this.A0C.A0I(false);
                    if (!z) {
                        this.A0C.A0A();
                    }
                }
                this.A0N = false;
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2674ce
    public final void AHk(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final void AI4(boolean z, int i) {
        this.A0A.A0F().A41(i);
        this.A0E = EnumC2646cC.A05;
        this.A0M = z;
        if (this.A0C != null) {
            this.A0C.A0I(false);
        } else {
            setVideoState(EnumC2646cC.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final void ALJ(int i) {
        this.A0A.A0F().ADO(i);
        setVideoState(EnumC2646cC.A09);
        ALY(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final void ALO(EnumC2761e4 enumC2761e4, int i) {
        this.A0A.A0F().A4F(i);
        this.A0M = false;
        this.A0E = EnumC2646cC.A0A;
        this.A0B = enumC2761e4;
        if (this.A0C == null) {
            setup(this.A06);
        } else {
            if (this.A0D != EnumC2646cC.A07 && this.A0D != EnumC2646cC.A05 && this.A0D != EnumC2646cC.A06) {
                return;
            }
            this.A0C.A0I(true);
            setVideoState(EnumC2646cC.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final void ALY(int i) {
        this.A0A.A0F().A4H(i);
        this.A0E = EnumC2646cC.A04;
        if (this.A0C != null) {
            this.A0C.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC2646cC.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public int getCurrentPosition() {
        if (this.A0C != null) {
            return (int) this.A0C.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public int getDuration() {
        if (this.A0C == null) {
            return 0;
        }
        return (int) this.A0C.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public EnumC2761e4 getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public EnumC2646cC getState() {
        return this.A0D;
    }

    public EnumC2646cC getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C3300mv.A2o(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC2646cC.A03);
            ALY(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A07 != null) {
            this.A07.release();
        }
        this.A07 = new Surface(surfaceTexture);
        if (this.A0C == null) {
            return;
        }
        this.A0C.A0E(this.A07);
        if (this.A0D == EnumC2646cC.A05 && !this.A0M) {
            ALO(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.A07 != null) {
            this.A07.release();
            this.A07 = null;
            if (this.A0C != null) {
                try {
                    this.A0C.A0E(null);
                } catch (Exception e) {
                    this.A0A.A0F().ADN(A03(0, 75, 85) + e.getMessage());
                }
            }
        }
        if (this.A0D != EnumC2646cC.A05) {
            try {
                AI4(false, 5);
                return true;
            } catch (Exception e2) {
                this.A0A.A0F().ADN(A03(75, 68, 79) + e2.getMessage());
                return true;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        if (this.A09 != null && this.A09.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != EnumC2646cC.A05) {
                if ((this.A0A.A0H().A01() || C3300mv.A25(this.A0A)) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.cO
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.A00.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    AAH();
                    return;
                }
            }
            return;
        }
        if (this.A0D != EnumC2646cC.A05 || this.A0M) {
            return;
        }
        ALO(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
            return;
        }
        long j = i;
        String[] strArr = A0P;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0P[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean zIsDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0P[5].length() != 21) {
            throw new RuntimeException();
        }
        A0P[1] = "HF5JdwiOlRNKOfaOH";
        if (!zIsDebugBuild) {
            return;
        }
        Log.w(A0Q, A03(143, 102, 51));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC2654cK(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
            return;
        }
        if (!AdInternalSettings.isDebugBuild()) {
            return;
        }
        String str = A0Q;
        String[] strArr = A0P;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0P;
        strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
        strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
        Log.w(str, A03(245, 94, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new ViewOnTouchListenerC2655cL(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != EnumC2646cC.A08 && this.A0D != EnumC2646cC.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC2646cC enumC2646cC) {
        if (enumC2646cC != this.A0D) {
            if (this.A0A.A05().AB6()) {
                String str = A03(339, 23, 33) + enumC2646cC;
            }
            this.A0D = enumC2646cC;
            if (this.A0D == EnumC2646cC.A0A) {
                this.A0N = true;
            }
            if (this.A0F != null) {
                this.A0F.AHn(enumC2646cC);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public void setVideoStateChangeListener(InterfaceC2645cB interfaceC2645cB) {
        this.A0F = interfaceC2645cB;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2647cD
    public void setup(Uri uri) {
        this.A0A.A0F().A44();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
