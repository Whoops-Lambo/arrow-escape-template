package com.adsurge.adn.p032j0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static RectF a = new RectF();
    public static Path b = new Path();

    public static void a(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (canvas == null || paint == null) {
            return;
        }
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = 0.0f;
        }
        if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f5 = 0.0f;
        }
        if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f6 = 0.0f;
        }
        if (f7 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f7 = 0.0f;
        }
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 -= 1.0f;
        }
        b.reset();
        b.moveTo(f4, f3);
        b.lineTo(f - f5, f3);
        if (f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f8 = (f5 - f3) * 2.0f;
            a.set(f - f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f8);
            a.offset(-f3, f3);
            b.arcTo(a, 270.0f, 90.0f);
        }
        b.lineTo(f - f3, f2 - f7);
        if (f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f9 = (f7 - f3) * 2.0f;
            a.set(f - f9, f2 - f9, f, f2);
            float f10 = -f3;
            a.offset(f10, f10);
            b.arcTo(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f);
        }
        b.lineTo(f6, f2 - f3);
        if (f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f11 = (f6 - f3) * 2.0f;
            a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - f11, f11, f2);
            a.offset(f3, -f3);
            b.arcTo(a, 90.0f, 90.0f);
        }
        b.lineTo(f3, f4);
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f12 = (f4 - f3) * 2.0f;
            a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, f12);
            a.offset(f3, f3);
            b.arcTo(a, 180.0f, 90.0f);
        }
        canvas.drawPath(b, paint);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static void b(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if (canvas == null || paint == null) {
            return;
        }
        float f28 = f3 / 2.0f;
        float f29 = f4 + f6;
        if (f29 >= f2) {
            if (f29 > f2) {
                f8 = f4 - 0.45f;
                f9 = f6 - 0.45f;
            }
            f10 = f5 + f7;
            if (f10 < f2) {
                if (f10 > f2) {
                    f11 = f5 - 0.45f;
                    f12 = f7 - 0.45f;
                }
                f13 = f8 + f11;
                if (f13 < f) {
                    f14 = f8;
                    canvas.drawLine(f14, f28, f - f11, f28, paint);
                    f15 = f28;
                } else {
                    f14 = f8;
                    f15 = f28;
                    if (f13 > f) {
                        if (f14 == ((int) f14)) {
                            f14 -= 0.45f;
                        }
                        if (f11 == ((int) f11)) {
                            f11 -= 0.45f;
                        }
                    }
                }
                f16 = f11;
                f17 = f9 + f12;
                if (f17 < f) {
                    f18 = f9;
                    if (f17 <= f) {
                        if (f12 == ((int) f12)) {
                            f12 -= 0.45f;
                        }
                        if (f18 == ((int) f18)) {
                            f19 = f18 - 0.45f;
                        }
                    }
                    if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (f14 >= f3) {
                            f26 = (f14 * 2.0f) - f15;
                            f27 = f15;
                        } else {
                            float f30 = f14 / 2.0f;
                            f26 = f14 + f30;
                            f27 = f30;
                        }
                        a.set(f27, f27, f26, f26);
                        canvas.drawArc(a, 180.0f, 90.0f, false, paint);
                    }
                    if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (f16 >= f3) {
                            f25 = (f16 * 2.0f) - f15;
                            f24 = f15;
                        } else {
                            f24 = f16 / 2.0f;
                            f25 = f16 + f24;
                        }
                        a.set(f - f25, f24, f - f24, f25);
                        canvas.drawArc(a, 270.0f, 90.0f, false, paint);
                    }
                    if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (f12 >= f3) {
                            f23 = (f12 * 2.0f) - f15;
                            f22 = f15;
                        } else {
                            f22 = f12 / 2.0f;
                            f23 = f12 + f22;
                        }
                        a.set(f - f23, f2 - f23, f - f22, f2 - f22);
                        canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
                    }
                    if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (f19 >= f3) {
                            f21 = (f19 * 2.0f) - f15;
                            f20 = f15;
                        } else {
                            f20 = f19 / 2.0f;
                            f21 = f19 + f20;
                        }
                        a.set(f20, f2 - f21, f21, f2 - f20);
                        canvas.drawArc(a, 90.0f, 90.0f, false, paint);
                    }
                }
                float f31 = f2 - f15;
                f18 = f9;
                canvas.drawLine(f18, f31, f - f12, f31, paint);
                f19 = f18;
                if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f14 >= f3) {
                        f26 = (f14 * 2.0f) - f15;
                        f27 = f15;
                    } else {
                        float f32 = f14 / 2.0f;
                        f26 = f14 + f32;
                        f27 = f32;
                    }
                    a.set(f27, f27, f26, f26);
                    canvas.drawArc(a, 180.0f, 90.0f, false, paint);
                }
                if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f16 >= f3) {
                        f25 = (f16 * 2.0f) - f15;
                        f24 = f15;
                    } else {
                        f24 = f16 / 2.0f;
                        f25 = f16 + f24;
                    }
                    a.set(f - f25, f24, f - f24, f25);
                    canvas.drawArc(a, 270.0f, 90.0f, false, paint);
                }
                if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f12 >= f3) {
                        f23 = (f12 * 2.0f) - f15;
                        f22 = f15;
                    } else {
                        f22 = f12 / 2.0f;
                        f23 = f12 + f22;
                    }
                    a.set(f - f23, f2 - f23, f - f22, f2 - f22);
                    canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
                }
                if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f19 >= f3) {
                        f21 = (f19 * 2.0f) - f15;
                        f20 = f15;
                    } else {
                        f20 = f19 / 2.0f;
                        f21 = f19 + f20;
                    }
                    a.set(f20, f2 - f21, f21, f2 - f20);
                    canvas.drawArc(a, 90.0f, 90.0f, false, paint);
                }
            }
            float f33 = f - f28;
            canvas.drawLine(f33, f5, f33, f2 - f7, paint);
            f11 = f5;
            f12 = f7;
            f13 = f8 + f11;
            if (f13 < f) {
                f14 = f8;
                canvas.drawLine(f14, f28, f - f11, f28, paint);
                f15 = f28;
            } else {
                f14 = f8;
                f15 = f28;
                if (f13 > f) {
                    if (f14 == ((int) f14)) {
                        f14 -= 0.45f;
                    }
                    if (f11 == ((int) f11)) {
                        f11 -= 0.45f;
                    }
                }
            }
            f16 = f11;
            f17 = f9 + f12;
            if (f17 < f) {
                f18 = f9;
                if (f17 <= f) {
                    if (f12 == ((int) f12)) {
                        f12 -= 0.45f;
                    }
                    if (f18 == ((int) f18)) {
                        f19 = f18 - 0.45f;
                    }
                }
                if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f14 >= f3) {
                        f26 = (f14 * 2.0f) - f15;
                        f27 = f15;
                    } else {
                        float f34 = f14 / 2.0f;
                        f26 = f14 + f34;
                        f27 = f34;
                    }
                    a.set(f27, f27, f26, f26);
                    canvas.drawArc(a, 180.0f, 90.0f, false, paint);
                }
                if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f16 >= f3) {
                        f25 = (f16 * 2.0f) - f15;
                        f24 = f15;
                    } else {
                        f24 = f16 / 2.0f;
                        f25 = f16 + f24;
                    }
                    a.set(f - f25, f24, f - f24, f25);
                    canvas.drawArc(a, 270.0f, 90.0f, false, paint);
                }
                if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f12 >= f3) {
                        f23 = (f12 * 2.0f) - f15;
                        f22 = f15;
                    } else {
                        f22 = f12 / 2.0f;
                        f23 = f12 + f22;
                    }
                    a.set(f - f23, f2 - f23, f - f22, f2 - f22);
                    canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
                }
                if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f19 >= f3) {
                        f21 = (f19 * 2.0f) - f15;
                        f20 = f15;
                    } else {
                        f20 = f19 / 2.0f;
                        f21 = f19 + f20;
                    }
                    a.set(f20, f2 - f21, f21, f2 - f20);
                    canvas.drawArc(a, 90.0f, 90.0f, false, paint);
                }
            }
            float f35 = f2 - f15;
            f18 = f9;
            canvas.drawLine(f18, f35, f - f12, f35, paint);
            f19 = f18;
            if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f14 >= f3) {
                    f26 = (f14 * 2.0f) - f15;
                    f27 = f15;
                } else {
                    float f36 = f14 / 2.0f;
                    f26 = f14 + f36;
                    f27 = f36;
                }
                a.set(f27, f27, f26, f26);
                canvas.drawArc(a, 180.0f, 90.0f, false, paint);
            }
            if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f16 >= f3) {
                    f25 = (f16 * 2.0f) - f15;
                    f24 = f15;
                } else {
                    f24 = f16 / 2.0f;
                    f25 = f16 + f24;
                }
                a.set(f - f25, f24, f - f24, f25);
                canvas.drawArc(a, 270.0f, 90.0f, false, paint);
            }
            if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f12 >= f3) {
                    f23 = (f12 * 2.0f) - f15;
                    f22 = f15;
                } else {
                    f22 = f12 / 2.0f;
                    f23 = f12 + f22;
                }
                a.set(f - f23, f2 - f23, f - f22, f2 - f22);
                canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
            }
            if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f19 >= f3) {
                    f21 = (f19 * 2.0f) - f15;
                    f20 = f15;
                } else {
                    f20 = f19 / 2.0f;
                    f21 = f19 + f20;
                }
                a.set(f20, f2 - f21, f21, f2 - f20);
                canvas.drawArc(a, 90.0f, 90.0f, false, paint);
            }
        }
        canvas.drawLine(f28, f4, f28, f2 - f6, paint);
        f8 = f4;
        f9 = f6;
        f10 = f5 + f7;
        if (f10 < f2) {
            if (f10 > f2) {
                f11 = f5 - 0.45f;
                f12 = f7 - 0.45f;
            }
            f13 = f8 + f11;
            if (f13 < f) {
                f14 = f8;
                canvas.drawLine(f14, f28, f - f11, f28, paint);
                f15 = f28;
            } else {
                f14 = f8;
                f15 = f28;
                if (f13 > f) {
                    if (f14 == ((int) f14)) {
                        f14 -= 0.45f;
                    }
                    if (f11 == ((int) f11)) {
                        f11 -= 0.45f;
                    }
                }
            }
            f16 = f11;
            f17 = f9 + f12;
            if (f17 < f) {
                f18 = f9;
                if (f17 <= f) {
                    if (f12 == ((int) f12)) {
                        f12 -= 0.45f;
                    }
                    if (f18 == ((int) f18)) {
                        f19 = f18 - 0.45f;
                    }
                }
                if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f14 >= f3) {
                        f26 = (f14 * 2.0f) - f15;
                        f27 = f15;
                    } else {
                        float f37 = f14 / 2.0f;
                        f26 = f14 + f37;
                        f27 = f37;
                    }
                    a.set(f27, f27, f26, f26);
                    canvas.drawArc(a, 180.0f, 90.0f, false, paint);
                }
                if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f16 >= f3) {
                        f25 = (f16 * 2.0f) - f15;
                        f24 = f15;
                    } else {
                        f24 = f16 / 2.0f;
                        f25 = f16 + f24;
                    }
                    a.set(f - f25, f24, f - f24, f25);
                    canvas.drawArc(a, 270.0f, 90.0f, false, paint);
                }
                if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f12 >= f3) {
                        f23 = (f12 * 2.0f) - f15;
                        f22 = f15;
                    } else {
                        f22 = f12 / 2.0f;
                        f23 = f12 + f22;
                    }
                    a.set(f - f23, f2 - f23, f - f22, f2 - f22);
                    canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
                }
                if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (f19 >= f3) {
                        f21 = (f19 * 2.0f) - f15;
                        f20 = f15;
                    } else {
                        f20 = f19 / 2.0f;
                        f21 = f19 + f20;
                    }
                    a.set(f20, f2 - f21, f21, f2 - f20);
                    canvas.drawArc(a, 90.0f, 90.0f, false, paint);
                }
            }
            float f38 = f2 - f15;
            f18 = f9;
            canvas.drawLine(f18, f38, f - f12, f38, paint);
            f19 = f18;
            if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f14 >= f3) {
                    f26 = (f14 * 2.0f) - f15;
                    f27 = f15;
                } else {
                    float f39 = f14 / 2.0f;
                    f26 = f14 + f39;
                    f27 = f39;
                }
                a.set(f27, f27, f26, f26);
                canvas.drawArc(a, 180.0f, 90.0f, false, paint);
            }
            if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f16 >= f3) {
                    f25 = (f16 * 2.0f) - f15;
                    f24 = f15;
                } else {
                    f24 = f16 / 2.0f;
                    f25 = f16 + f24;
                }
                a.set(f - f25, f24, f - f24, f25);
                canvas.drawArc(a, 270.0f, 90.0f, false, paint);
            }
            if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f12 >= f3) {
                    f23 = (f12 * 2.0f) - f15;
                    f22 = f15;
                } else {
                    f22 = f12 / 2.0f;
                    f23 = f12 + f22;
                }
                a.set(f - f23, f2 - f23, f - f22, f2 - f22);
                canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
            }
            if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f19 >= f3) {
                    f21 = (f19 * 2.0f) - f15;
                    f20 = f15;
                } else {
                    f20 = f19 / 2.0f;
                    f21 = f19 + f20;
                }
                a.set(f20, f2 - f21, f21, f2 - f20);
                canvas.drawArc(a, 90.0f, 90.0f, false, paint);
            }
        }
        float f310 = f - f28;
        canvas.drawLine(f310, f5, f310, f2 - f7, paint);
        f11 = f5;
        f12 = f7;
        f13 = f8 + f11;
        if (f13 < f) {
            f14 = f8;
            canvas.drawLine(f14, f28, f - f11, f28, paint);
            f15 = f28;
        } else {
            f14 = f8;
            f15 = f28;
            if (f13 > f) {
                if (f14 == ((int) f14)) {
                    f14 -= 0.45f;
                }
                if (f11 == ((int) f11)) {
                    f11 -= 0.45f;
                }
            }
        }
        f16 = f11;
        f17 = f9 + f12;
        if (f17 < f) {
            f18 = f9;
            if (f17 <= f) {
                if (f12 == ((int) f12)) {
                    f12 -= 0.45f;
                }
                if (f18 == ((int) f18)) {
                    f19 = f18 - 0.45f;
                }
            }
            if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f14 >= f3) {
                    f26 = (f14 * 2.0f) - f15;
                    f27 = f15;
                } else {
                    float f311 = f14 / 2.0f;
                    f26 = f14 + f311;
                    f27 = f311;
                }
                a.set(f27, f27, f26, f26);
                canvas.drawArc(a, 180.0f, 90.0f, false, paint);
            }
            if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f16 >= f3) {
                    f25 = (f16 * 2.0f) - f15;
                    f24 = f15;
                } else {
                    f24 = f16 / 2.0f;
                    f25 = f16 + f24;
                }
                a.set(f - f25, f24, f - f24, f25);
                canvas.drawArc(a, 270.0f, 90.0f, false, paint);
            }
            if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f12 >= f3) {
                    f23 = (f12 * 2.0f) - f15;
                    f22 = f15;
                } else {
                    f22 = f12 / 2.0f;
                    f23 = f12 + f22;
                }
                a.set(f - f23, f2 - f23, f - f22, f2 - f22);
                canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
            }
            if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f19 >= f3) {
                    f21 = (f19 * 2.0f) - f15;
                    f20 = f15;
                } else {
                    f20 = f19 / 2.0f;
                    f21 = f19 + f20;
                }
                a.set(f20, f2 - f21, f21, f2 - f20);
                canvas.drawArc(a, 90.0f, 90.0f, false, paint);
            }
        }
        float f312 = f2 - f15;
        f18 = f9;
        canvas.drawLine(f18, f312, f - f12, f312, paint);
        f19 = f18;
        if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f14 >= f3) {
                f26 = (f14 * 2.0f) - f15;
                f27 = f15;
            } else {
                float f313 = f14 / 2.0f;
                f26 = f14 + f313;
                f27 = f313;
            }
            a.set(f27, f27, f26, f26);
            canvas.drawArc(a, 180.0f, 90.0f, false, paint);
        }
        if (f16 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f16 >= f3) {
                f25 = (f16 * 2.0f) - f15;
                f24 = f15;
            } else {
                f24 = f16 / 2.0f;
                f25 = f16 + f24;
            }
            a.set(f - f25, f24, f - f24, f25);
            canvas.drawArc(a, 270.0f, 90.0f, false, paint);
        }
        if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f12 >= f3) {
                f23 = (f12 * 2.0f) - f15;
                f22 = f15;
            } else {
                f22 = f12 / 2.0f;
                f23 = f12 + f22;
            }
            a.set(f - f23, f2 - f23, f - f22, f2 - f22);
            canvas.drawArc(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false, paint);
        }
        if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f19 >= f3) {
                f21 = (f19 * 2.0f) - f15;
                f20 = f15;
            } else {
                f20 = f19 / 2.0f;
                f21 = f19 + f20;
            }
            a.set(f20, f2 - f21, f21, f2 - f20);
            canvas.drawArc(a, 90.0f, 90.0f, false, paint);
        }
    }

    public static void a(Canvas canvas, Paint paint, int i, int i2, int i3, int[] iArr) {
        if (canvas == null || paint == null) {
            return;
        }
        if (i3 == 0 && (iArr == null || iArr.length < 4)) {
            canvas.drawPaint(paint);
        } else if (iArr != null && iArr.length >= 4) {
            a(canvas, paint, i, i2, i3, iArr[0], iArr[1], iArr[3], iArr[2]);
        } else {
            a(canvas, paint, i, i2, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public static void a(Canvas canvas, int i, int i2, int i3, int[] iArr) {
        if (iArr == null || iArr.length < 4) {
            return;
        }
        a(canvas, i, i2, i3, iArr[0], iArr[1], iArr[3], iArr[2]);
    }

    public static void a(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (canvas == null) {
            return;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        b.reset();
        float f = i4;
        b.moveTo(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b.lineTo(i - i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (i5 > 0) {
            float f2 = i5 * 2;
            float f3 = i;
            a.set(f3 - f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f2);
            b.arcTo(a, 270.0f, 90.0f);
        }
        float f4 = i;
        b.lineTo(f4, i2 - i7);
        if (i7 > 0) {
            float f5 = i7 * 2;
            float f6 = i2;
            a.set(f4 - f5, f6 - f5, f4, f6);
            b.arcTo(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f);
        }
        float f7 = i2;
        b.lineTo(i6, f7);
        if (i6 > 0) {
            float f8 = i6 * 2;
            a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7 - f8, f8, f7);
            b.arcTo(a, 90.0f, 90.0f);
        }
        b.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        if (i4 > 0) {
            float f9 = i4 * 2;
            a.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9, f9);
            b.arcTo(a, 180.0f, 90.0f);
        }
        canvas.clipPath(b);
    }

    public static void b(Canvas canvas, Paint paint, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        if (i3 == 0) {
            return;
        }
        int i7 = 0;
        if (iArr == null || iArr.length < 4) {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        } else {
            int i8 = iArr[0];
            i5 = iArr[1];
            int i9 = iArr[2];
            i4 = iArr[3];
            i6 = i8;
            i7 = i9;
        }
        b(canvas, paint, i, i2, i3, i6, i5, i4, i7);
    }
}
