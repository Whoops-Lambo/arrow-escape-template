package com.adsurge.adn.p044n0;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public final int a;
    public final k b;
    public final int c;
    public final int d;
    public final k e;
    public final int f;
    public PointF g;
    public int h = 0;
    public int i = 0;
    public boolean j;

    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    public void a(boolean z, View view) {
        Float fValueOf;
        Float fA;
        Float fA2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        Float fValueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i = z ? this.c : this.d;
        if (i == 0) {
            return;
        }
        Float f = null;
        switch (i) {
            case 1:
                float width = (view.getWidth() / 2.0f) + view.getLeft() + view.getTranslationX();
                float f2 = this.h / 2.0f;
                k kVar = this.e;
                fValueOf2 = width > f2 ? Float.valueOf(kVar.a()) : Float.valueOf(kVar.b());
                fA = a(view, fValueOf2, true);
                fA2 = a(view, f, false);
                viewPropertyAnimatorAnimate = view.animate();
                if (fA != null) {
                    viewPropertyAnimatorAnimate.translationX(fA.floatValue());
                }
                if (fA2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fA2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(this.f).start();
                break;
            case 2:
                float height = (view.getHeight() / 2.0f) + view.getTop() + view.getTranslationY();
                float f3 = this.i / 2.0f;
                k kVar2 = this.e;
                fValueOf = height > f3 ? Float.valueOf(kVar2.c()) : Float.valueOf(kVar2.d());
                f = fValueOf;
                fValueOf2 = null;
                fA = a(view, fValueOf2, true);
                fA2 = a(view, f, false);
                viewPropertyAnimatorAnimate = view.animate();
                if (fA != null) {
                    viewPropertyAnimatorAnimate.translationX(fA.floatValue());
                }
                if (fA2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fA2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(this.f).start();
                break;
            case 3:
                fValueOf = Float.valueOf(this.e.d());
                f = fValueOf;
                fValueOf2 = null;
                fA = a(view, fValueOf2, true);
                fA2 = a(view, f, false);
                viewPropertyAnimatorAnimate = view.animate();
                if (fA != null) {
                    viewPropertyAnimatorAnimate.translationX(fA.floatValue());
                }
                if (fA2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fA2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(this.f).start();
                break;
            case 4:
                fValueOf = Float.valueOf(this.e.c());
                f = fValueOf;
                fValueOf2 = null;
                fA = a(view, fValueOf2, true);
                fA2 = a(view, f, false);
                viewPropertyAnimatorAnimate = view.animate();
                if (fA != null) {
                    viewPropertyAnimatorAnimate.translationX(fA.floatValue());
                }
                if (fA2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fA2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(this.f).start();
                break;
            case 5:
                fValueOf2 = Float.valueOf(this.e.b());
                fA = a(view, fValueOf2, true);
                fA2 = a(view, f, false);
                viewPropertyAnimatorAnimate = view.animate();
                if (fA != null) {
                    viewPropertyAnimatorAnimate.translationX(fA.floatValue());
                }
                if (fA2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fA2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(this.f).start();
                break;
            case 6:
                fValueOf2 = Float.valueOf(this.e.a());
                fA = a(view, fValueOf2, true);
                fA2 = a(view, f, false);
                viewPropertyAnimatorAnimate = view.animate();
                if (fA != null) {
                    viewPropertyAnimatorAnimate.translationX(fA.floatValue());
                }
                if (fA2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fA2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(this.f).start();
                break;
            case 7:
                f = fValueOf2;
                fA = a(view, fValueOf2, true);
                fA2 = a(view, f, false);
                viewPropertyAnimatorAnimate = view.animate();
                if (fA != null) {
                    viewPropertyAnimatorAnimate.translationX(fA.floatValue());
                }
                if (fA2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fA2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(this.f).start();
                break;
        }
    }

    public final Float b(View view, Float f, boolean z) {
        if (f == null) {
            return null;
        }
        k kVar = this.b;
        float fB = z ? kVar.b() : kVar.d();
        k kVar2 = this.b;
        float fA = z ? kVar2.a() : kVar2.c();
        float translationX = z ? view.getTranslationX() : view.getTranslationY();
        if (f.floatValue() < fB) {
            if (translationX != fB) {
                return Float.valueOf(fB);
            }
        } else {
            if (f.floatValue() <= fA) {
                return f;
            }
            if (translationX != fA) {
                return Float.valueOf(fA);
            }
        }
        return null;
    }

    public d(JSONObject jSONObject) {
        this.a = jSONObject.optInt("dd", 0);
        this.b = new k(jSONObject.optJSONArray("da"), true);
        this.c = jSONObject.optInt("ads", 0);
        this.d = jSONObject.optInt("adf", 0);
        this.e = new k(jSONObject.optJSONArray("aa"), false);
        int iOptInt = jSONObject.optInt("at");
        this.f = iOptInt > 0 ? iOptInt : 0;
    }

    public void b(View view, PointF pointF) {
        this.g = new PointF(pointF.x - view.getTranslationX(), pointF.y - view.getTranslationY());
        if (this.j) {
            return;
        }
        this.j = true;
        this.b.a(view);
        this.e.a(view);
        View view2 = (View) view.getParent();
        this.h = view2.getWidth();
        this.i = view2.getHeight();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ab  */
    public void a(View view, PointF pointF) {
        Float fValueOf;
        Float fValueOf2;
        Float fB;
        Float fB2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        Float fValueOf3 = null;
        switch (this.a) {
            case 0:
                fValueOf3 = Float.valueOf(pointF.x - this.g.x);
                fValueOf = Float.valueOf(pointF.y - this.g.y);
                fB = b(view, fValueOf3, true);
                fB2 = b(view, fValueOf, false);
                if (fB == null || fB2 != null) {
                    viewPropertyAnimatorAnimate = view.animate();
                    if (fB != null) {
                        viewPropertyAnimatorAnimate.translationX(fB.floatValue());
                    }
                    if (fB2 != null) {
                        viewPropertyAnimatorAnimate.translationY(fB2.floatValue());
                    }
                    viewPropertyAnimatorAnimate.setDuration(0L).start();
                }
                break;
            case 1:
                fValueOf2 = Float.valueOf(pointF.x - this.g.x);
                fValueOf3 = fValueOf2;
                fValueOf = null;
                fB = b(view, fValueOf3, true);
                fB2 = b(view, fValueOf, false);
                if (fB == null) {
                }
                viewPropertyAnimatorAnimate = view.animate();
                if (fB != null) {
                    viewPropertyAnimatorAnimate.translationX(fB.floatValue());
                }
                if (fB2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fB2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(0L).start();
                break;
            case 2:
                fValueOf = Float.valueOf(pointF.y - this.g.y);
                fB = b(view, fValueOf3, true);
                fB2 = b(view, fValueOf, false);
                if (fB == null) {
                }
                viewPropertyAnimatorAnimate = view.animate();
                if (fB != null) {
                    viewPropertyAnimatorAnimate.translationX(fB.floatValue());
                }
                if (fB2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fB2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(0L).start();
                break;
            case 3:
                fValueOf = Float.valueOf(Math.min(pointF.y - this.g.y, -view.getTranslationY()));
                fB = b(view, fValueOf3, true);
                fB2 = b(view, fValueOf, false);
                if (fB == null) {
                }
                viewPropertyAnimatorAnimate = view.animate();
                if (fB != null) {
                    viewPropertyAnimatorAnimate.translationX(fB.floatValue());
                }
                if (fB2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fB2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(0L).start();
                break;
            case 4:
                fValueOf = Float.valueOf(Math.max(pointF.y - this.g.y, -view.getTranslationY()));
                fB = b(view, fValueOf3, true);
                fB2 = b(view, fValueOf, false);
                if (fB == null) {
                }
                viewPropertyAnimatorAnimate = view.animate();
                if (fB != null) {
                    viewPropertyAnimatorAnimate.translationX(fB.floatValue());
                }
                if (fB2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fB2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(0L).start();
                break;
            case 5:
                fValueOf2 = Float.valueOf(Math.min(pointF.x - this.g.x, -view.getTranslationX()));
                fValueOf3 = fValueOf2;
                fValueOf = null;
                fB = b(view, fValueOf3, true);
                fB2 = b(view, fValueOf, false);
                if (fB == null) {
                }
                viewPropertyAnimatorAnimate = view.animate();
                if (fB != null) {
                    viewPropertyAnimatorAnimate.translationX(fB.floatValue());
                }
                if (fB2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fB2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(0L).start();
                break;
            case 6:
                fValueOf2 = Float.valueOf(Math.max(pointF.x - this.g.x, -view.getTranslationX()));
                fValueOf3 = fValueOf2;
                fValueOf = null;
                fB = b(view, fValueOf3, true);
                fB2 = b(view, fValueOf, false);
                if (fB == null) {
                }
                viewPropertyAnimatorAnimate = view.animate();
                if (fB != null) {
                    viewPropertyAnimatorAnimate.translationX(fB.floatValue());
                }
                if (fB2 != null) {
                    viewPropertyAnimatorAnimate.translationY(fB2.floatValue());
                }
                viewPropertyAnimatorAnimate.setDuration(0L).start();
                break;
        }
    }

    public final Float a(View view, Float f, boolean z) {
        if (f != null) {
            return f;
        }
        float translationX = z ? view.getTranslationX() : view.getTranslationY();
        k kVar = this.e;
        float fB = z ? kVar.b() : kVar.d();
        k kVar2 = this.e;
        float fA = z ? kVar2.a() : kVar2.c();
        if (translationX < fB) {
            return Float.valueOf(fB);
        }
        return translationX > fA ? Float.valueOf(fA) : f;
    }

    public static d a(JSONObject jSONObject) {
        if (jSONObject.optInt("dg") == 1) {
            return new d(jSONObject);
        }
        return null;
    }
}
