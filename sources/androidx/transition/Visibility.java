package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Visibility extends Transition {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public int F = 3;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DisappearListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public boolean e;
        public boolean f = false;
        public final boolean d = true;

        @Override // androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
            c(true);
            if (this.f) {
                return;
            }
            ViewUtils.b(this.a, 0);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void h(Transition transition) {
            c(false);
            if (this.f) {
                return;
            }
            ViewUtils.b(this.a, this.b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        public final void c(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            ViewGroupUtils.a(viewGroup, z);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            if (!this.f) {
                ViewUtils.b(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                ViewUtils.b(this.a, 0);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        public DisappearListener(View view, int i) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            c(true);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void j(Transition transition) {
            transition.A(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f) {
                ViewUtils.b(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Mode {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class OverlayListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        public final ViewGroup a;
        public final View b;
        public final View c;
        public boolean d = true;

        @Override // androidx.transition.Transition.TransitionListener
        public final void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void h(Transition transition) {
        }

        public OverlayListener(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void k(Transition transition) {
            if (this.d) {
                c();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.b;
            if (view.getParent() == null) {
                this.a.getOverlay().add(view);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                View view = this.c;
                View view2 = this.b;
                view.setTag(com.ecffri.arrows.R.id.save_overlay_view, view2);
                this.a.getOverlay().add(view2);
                this.d = true;
            }
        }

        public final void c() {
            this.c.setTag(com.ecffri.arrows.R.id.save_overlay_view, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void j(Transition transition) {
            transition.A(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class VisibilityInfo {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public Animator Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public Animator R(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public static void O(TransitionValues transitionValues) {
        View view = transitionValues.b;
        int visibility = view.getVisibility();
        HashMap map = transitionValues.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static VisibilityInfo P(TransitionValues transitionValues, TransitionValues transitionValues2) {
        VisibilityInfo visibilityInfo = new VisibilityInfo();
        visibilityInfo.a = false;
        visibilityInfo.b = false;
        if (transitionValues != null) {
            HashMap map = transitionValues.a;
            if (map.containsKey("android:visibility:visibility")) {
                visibilityInfo.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                visibilityInfo.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                visibilityInfo.c = -1;
                visibilityInfo.e = null;
            }
        } else {
            visibilityInfo.c = -1;
            visibilityInfo.e = null;
        }
        if (transitionValues2 != null) {
            HashMap map2 = transitionValues2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                visibilityInfo.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                visibilityInfo.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                visibilityInfo.d = -1;
                visibilityInfo.f = null;
            }
        } else {
            visibilityInfo.d = -1;
            visibilityInfo.f = null;
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i = visibilityInfo.c;
            int i2 = visibilityInfo.d;
            if (i != i2 || visibilityInfo.e != visibilityInfo.f) {
                if (i != i2) {
                    if (i == 0) {
                        visibilityInfo.b = false;
                        visibilityInfo.a = true;
                        return visibilityInfo;
                    }
                    if (i2 == 0) {
                        visibilityInfo.b = true;
                        visibilityInfo.a = true;
                        return visibilityInfo;
                    }
                } else {
                    if (visibilityInfo.f == null) {
                        visibilityInfo.b = false;
                        visibilityInfo.a = true;
                        return visibilityInfo;
                    }
                    if (visibilityInfo.e == null) {
                        visibilityInfo.b = true;
                        visibilityInfo.a = true;
                        return visibilityInfo;
                    }
                }
            }
        } else {
            if (transitionValues == null && visibilityInfo.d == 0) {
                visibilityInfo.b = true;
                visibilityInfo.a = true;
                return visibilityInfo;
            }
            if (transitionValues2 == null && visibilityInfo.c == 0) {
                visibilityInfo.b = false;
                visibilityInfo.a = true;
            }
        }
        return visibilityInfo;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:66:0x015a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (P(n(r5, false), r(r5, false)).a != false) goto L9;
     */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, androidx.transition.TransitionValues r25, androidx.transition.TransitionValues r26) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.k(android.view.ViewGroup, androidx.transition.TransitionValues, androidx.transition.TransitionValues):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final String[] q() {
        return G;
    }

    @Override // androidx.transition.Transition
    public final boolean u(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.a.containsKey("android:visibility:visibility") != transitionValues.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        VisibilityInfo visibilityInfoP = P(transitionValues, transitionValues2);
        if (visibilityInfoP.a) {
            return visibilityInfoP.c == 0 || visibilityInfoP.d == 0;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public void d(TransitionValues transitionValues) {
        O(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void g(TransitionValues transitionValues) {
        O(transitionValues);
    }
}
