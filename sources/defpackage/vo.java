package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.ui.CaptionStyleCompat;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vo extends View implements il2 {
    public final ArrayList a;
    public List b;
    public int c;
    public float d;
    public CaptionStyleCompat e;
    public float f;

    public vo(Context context, int i) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0;
        this.d = 0.0533f;
        this.e = CaptionStyleCompat.DEFAULT;
        this.f = 0.08f;
    }

    @Override // defpackage.il2
    public final void a(List list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.b = list;
        this.e = captionStyleCompat;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new gl2(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0463  */
    /* JADX WARN: Code duplicated, block: B:189:0x0466  */
    /* JADX WARN: Code duplicated, block: B:191:0x0469  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        int iMax;
        int iMin;
        int iRound;
        vo voVar = this;
        List list = voVar.b;
        if (list.isEmpty()) {
            return;
        }
        int height = voVar.getHeight();
        int paddingLeft = voVar.getPaddingLeft();
        int paddingTop = voVar.getPaddingTop();
        int width = voVar.getWidth() - voVar.getPaddingRight();
        int paddingBottom = height - voVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i6 = paddingBottom - paddingTop;
        float fB = jl2.b(voVar.c, voVar.d, height, i6);
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (fB <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            Cue cueBuild = (Cue) list.get(i7);
            float f4 = f3;
            if (cueBuild.verticalType != Integer.MIN_VALUE) {
                Cue.Builder textAlignment = cueBuild.buildUpon().setPosition(-3.4028235E38f).setPositionAnchor(Integer.MIN_VALUE).setTextAlignment(null);
                int i8 = cueBuild.lineType;
                float f5 = cueBuild.line;
                if (i8 == 0) {
                    textAlignment.setLine(1.0f - f5, 0);
                } else {
                    textAlignment.setLine((-f5) - 1.0f, 1);
                }
                int i9 = cueBuild.lineAnchor;
                if (i9 == 0) {
                    textAlignment.setLineAnchor(2);
                } else if (i9 == 2) {
                    textAlignment.setLineAnchor(0);
                }
                cueBuild = textAlignment.build();
            }
            float fB2 = jl2.b(cueBuild.textSizeType, cueBuild.textSize, height, i6);
            gl2 gl2Var = (gl2) voVar.a.get(i7);
            CaptionStyleCompat captionStyleCompat = voVar.e;
            List list2 = list;
            float f6 = voVar.f;
            TextPaint textPaint = gl2Var.f;
            int i10 = height;
            boolean z = cueBuild.bitmap == null;
            int i11 = i6;
            if (z) {
                if (TextUtils.isEmpty(cueBuild.text)) {
                    i2 = size;
                    i3 = i7;
                } else {
                    i = cueBuild.windowColorSet ? cueBuild.windowColor : captionStyleCompat.windowColor;
                }
                i7 = i3 + 1;
                voVar = this;
                f3 = f4;
                list = list2;
                height = i10;
                i6 = i11;
                size = i2;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                width = width;
            } else {
                i = -16777216;
            }
            i2 = size;
            CharSequence charSequence = gl2Var.i;
            i3 = i7;
            CharSequence charSequence2 = cueBuild.text;
            if ((charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2))) && Util.areEqual(gl2Var.j, cueBuild.textAlignment) && gl2Var.k == cueBuild.bitmap && gl2Var.l == cueBuild.line && gl2Var.m == cueBuild.lineType && Util.areEqual(Integer.valueOf(gl2Var.n), Integer.valueOf(cueBuild.lineAnchor)) && gl2Var.o == cueBuild.position && Util.areEqual(Integer.valueOf(gl2Var.p), Integer.valueOf(cueBuild.positionAnchor)) && gl2Var.q == cueBuild.size && gl2Var.r == cueBuild.bitmapHeight && gl2Var.s == captionStyleCompat.foregroundColor && gl2Var.t == captionStyleCompat.backgroundColor && gl2Var.u == i && gl2Var.w == captionStyleCompat.edgeType && gl2Var.v == captionStyleCompat.edgeColor && Util.areEqual(textPaint.getTypeface(), captionStyleCompat.typeface) && gl2Var.x == fB && gl2Var.y == fB2 && gl2Var.z == f6 && gl2Var.A == paddingLeft && gl2Var.B == paddingTop && gl2Var.C == width && gl2Var.D == paddingBottom) {
                gl2Var.a(canvas, z);
            } else {
                gl2Var.i = cueBuild.text;
                gl2Var.j = cueBuild.textAlignment;
                gl2Var.k = cueBuild.bitmap;
                gl2Var.l = cueBuild.line;
                gl2Var.m = cueBuild.lineType;
                gl2Var.n = cueBuild.lineAnchor;
                gl2Var.o = cueBuild.position;
                gl2Var.p = cueBuild.positionAnchor;
                gl2Var.q = cueBuild.size;
                gl2Var.r = cueBuild.bitmapHeight;
                gl2Var.s = captionStyleCompat.foregroundColor;
                gl2Var.t = captionStyleCompat.backgroundColor;
                gl2Var.u = i;
                gl2Var.w = captionStyleCompat.edgeType;
                gl2Var.v = captionStyleCompat.edgeColor;
                textPaint.setTypeface(captionStyleCompat.typeface);
                gl2Var.x = fB;
                gl2Var.y = fB2;
                gl2Var.z = f6;
                gl2Var.A = paddingLeft;
                gl2Var.B = paddingTop;
                gl2Var.C = width;
                gl2Var.D = paddingBottom;
                if (z) {
                    Assertions.checkNotNull(gl2Var.i);
                    CharSequence charSequence3 = gl2Var.i;
                    SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(gl2Var.i);
                    int i12 = gl2Var.C - gl2Var.A;
                    int i13 = gl2Var.D - gl2Var.B;
                    textPaint.setTextSize(gl2Var.x);
                    int i14 = (int) ((gl2Var.x * 0.125f) + 0.5f);
                    int i15 = i14 * 2;
                    int i16 = i12 - i15;
                    float f7 = gl2Var.q;
                    if (f7 != -3.4028235E38f) {
                        i16 = (int) (i16 * f7);
                    }
                    int i17 = i16;
                    if (i17 <= 0) {
                        Log.w("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                        paddingLeft = paddingLeft;
                        paddingTop = paddingTop;
                        width = width;
                    } else {
                        if (gl2Var.y > f4) {
                            i5 = 0;
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) gl2Var.y), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i5 = 0;
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                        if (gl2Var.w == 1) {
                            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i5, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                            int i18 = 0;
                            for (int length = foregroundColorSpanArr.length; i18 < length; length = length) {
                                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i18]);
                                i18++;
                            }
                        }
                        if (Color.alpha(gl2Var.t) > 0) {
                            int i19 = gl2Var.w;
                            if (i19 == 0 || i19 == 2) {
                                spannableStringBuilder.setSpan(new BackgroundColorSpan(gl2Var.t), 0, spannableStringBuilder.length(), 16711680);
                            } else {
                                spannableStringBuilder2.setSpan(new BackgroundColorSpan(gl2Var.t), 0, spannableStringBuilder2.length(), 16711680);
                            }
                        }
                        Layout.Alignment alignment = gl2Var.j;
                        if (alignment == null) {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, textPaint, i17, alignment2, gl2Var.d, gl2Var.e, true);
                        gl2Var.E = staticLayout;
                        int height2 = staticLayout.getHeight();
                        int lineCount = gl2Var.E.getLineCount();
                        int iMax2 = 0;
                        int i20 = 0;
                        while (i20 < lineCount) {
                            iMax2 = Math.max((int) Math.ceil(gl2Var.E.getLineWidth(i20)), iMax2);
                            i20++;
                            height2 = height2;
                            lineCount = lineCount;
                            spannableStringBuilder2 = spannableStringBuilder2;
                        }
                        SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                        int i21 = height2;
                        int i22 = ((gl2Var.q == -3.4028235E38f || iMax2 >= i17) ? iMax2 : i17) + i15;
                        float f8 = gl2Var.o;
                        if (f8 != -3.4028235E38f) {
                            int iRound2 = Math.round(i12 * f8);
                            int i23 = gl2Var.A;
                            int i24 = iRound2 + i23;
                            int i25 = gl2Var.p;
                            if (i25 == 1) {
                                i24 = ((i24 * 2) - i22) / 2;
                            } else if (i25 == 2) {
                                i24 -= i22;
                            }
                            iMax = Math.max(i24, i23);
                            iMin = Math.min(iMax + i22, gl2Var.C);
                        } else {
                            iMax = gl2Var.A + ((i12 - i22) / 2);
                            iMin = iMax + i22;
                        }
                        int i26 = iMin - iMax;
                        if (i26 <= 0) {
                            Log.w("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                        } else {
                            float f9 = gl2Var.l;
                            if (f9 != -3.4028235E38f) {
                                if (gl2Var.m == 0) {
                                    iRound = Math.round(i13 * f9) + gl2Var.B;
                                    int i27 = gl2Var.n;
                                    if (i27 == 2) {
                                        iRound -= i21;
                                    } else if (i27 == 1) {
                                        iRound = ((iRound * 2) - i21) / 2;
                                    }
                                } else {
                                    int lineBottom = gl2Var.E.getLineBottom(0) - gl2Var.E.getLineTop(0);
                                    float f10 = gl2Var.l;
                                    iRound = f10 >= f4 ? Math.round(f10 * lineBottom) + gl2Var.B : (Math.round((f10 + 1.0f) * lineBottom) + gl2Var.D) - i21;
                                }
                                int i28 = iRound + i21;
                                int i29 = gl2Var.D;
                                if (i28 > i29) {
                                    iRound = i29 - i21;
                                } else {
                                    int i30 = gl2Var.B;
                                    if (iRound < i30) {
                                        iRound = i30;
                                    }
                                }
                            } else {
                                iRound = (gl2Var.D - i21) - ((int) (i13 * gl2Var.z));
                            }
                            gl2Var.E = new StaticLayout(spannableStringBuilder3, textPaint, i26, alignment2, gl2Var.d, gl2Var.e, true);
                            gl2Var.F = new StaticLayout(spannableStringBuilder4, textPaint, i26, alignment2, gl2Var.d, gl2Var.e, true);
                            gl2Var.G = iMax;
                            gl2Var.H = iRound;
                            gl2Var.I = i14;
                        }
                    }
                } else {
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    width = width;
                    Assertions.checkNotNull(gl2Var.k);
                    Bitmap bitmap = gl2Var.k;
                    int i31 = gl2Var.C;
                    int i32 = gl2Var.A;
                    int i33 = gl2Var.D;
                    int i34 = gl2Var.B;
                    float f11 = i31 - i32;
                    float f12 = (gl2Var.o * f11) + i32;
                    float f13 = i33 - i34;
                    float f14 = (gl2Var.l * f13) + i34;
                    int iRound3 = Math.round(f11 * gl2Var.q);
                    float f15 = gl2Var.r;
                    int iRound4 = f15 != -3.4028235E38f ? Math.round(f13 * f15) : Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound3);
                    int i35 = gl2Var.p;
                    if (i35 == 2) {
                        f = iRound3;
                    } else {
                        if (i35 == 1) {
                            f = iRound3 / 2;
                        }
                        int iRound5 = Math.round(f12);
                        i4 = gl2Var.n;
                        if (i4 == 2) {
                            f2 = iRound4;
                        } else {
                            if (i4 == 1) {
                                f2 = iRound4 / 2;
                            }
                            int iRound6 = Math.round(f14);
                            gl2Var.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                        }
                        f14 -= f2;
                        int iRound7 = Math.round(f14);
                        gl2Var.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                    }
                    f12 -= f;
                    int iRound8 = Math.round(f12);
                    i4 = gl2Var.n;
                    if (i4 == 2) {
                        f2 = iRound4;
                    } else {
                        if (i4 == 1) {
                            f2 = iRound4 / 2;
                        }
                        int iRound9 = Math.round(f14);
                        gl2Var.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                    }
                    f14 -= f2;
                    int iRound10 = Math.round(f14);
                    gl2Var.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
                }
                gl2Var.a(canvas, z);
            }
            i7 = i3 + 1;
            voVar = this;
            f3 = f4;
            list = list2;
            height = i10;
            i6 = i11;
            size = i2;
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
            width = width;
        }
    }
}
