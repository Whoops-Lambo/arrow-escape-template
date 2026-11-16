package com.adsurge.adn.p014d0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class k implements j {
    public final String a;
    public final Animator b;
    public final i c;
    public c d;
    public boolean e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements j.a {
        public final String a;
        public i c;
        public final List b = new ArrayList();
        public boolean d = true;

        @Override // com.adsurge.adn.d0.j.a
        public void a(i iVar) {
            if (iVar != null) {
                String str = this.a;
                com.adsurge.adn.p026h0.a aVar = iVar.a;
                if (a(str, aVar.b)) {
                    if (this.d) {
                        int i = aVar.k;
                        if (i < 0) {
                            this.d = false;
                            this.c = null;
                        } else {
                            i iVar2 = this.c;
                            if (iVar2 == null || i > iVar2.a.k) {
                                this.c = iVar;
                            }
                        }
                    }
                    this.b.add(iVar.b);
                }
            }
        }

        public a(String str) {
            this.a = str;
        }

        @Override // com.adsurge.adn.d0.j.a
        public j a() {
            return new k(this.a, this.b, this.c);
        }

        public final boolean a(Object obj, Object obj2) {
            if (obj != obj2) {
                return obj != null && obj.equals(obj2);
            }
            return true;
        }
    }

    @Override // com.adsurge.adn.p014d0.j
    public void start() {
        a((b) null);
    }

    @Override // com.adsurge.adn.p014d0.j
    public void a(b bVar) {
        if (this.b == null) {
            return;
        }
        this.e = true;
        i iVar = this.c;
        if (iVar != null) {
            c cVar = this.d;
            if (bVar != null) {
                if (cVar == null) {
                    c cVar2 = new c(iVar);
                    this.d = cVar2;
                    this.c.b.addListener(cVar2);
                }
                this.d.a(bVar);
            } else if (cVar != null) {
                iVar.b.removeListener(cVar);
            }
        }
        this.b.start();
    }

    @Override // com.adsurge.adn.p014d0.j
    public void cancel() {
        ArrayList<Animator> childAnimations;
        Animator animator = this.b;
        if (animator == null || !this.e) {
            return;
        }
        this.e = false;
        if (animator.isStarted()) {
            this.b.cancel();
        }
        Animator animator2 = this.b;
        if ((animator2 instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator2).getChildAnimations()) != null && childAnimations.size() > 0) {
            int size = childAnimations.size();
            int i = 0;
            while (i < size) {
                Animator animator3 = childAnimations.get(i);
                i++;
                Animator animator4 = animator3;
                if (animator4.isStarted()) {
                    animator4.cancel();
                } else {
                    ArrayList<Animator.AnimatorListener> listeners = animator4.getListeners();
                    if (listeners != null && listeners.size() > 0) {
                        int size2 = listeners.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Animator.AnimatorListener animatorListener = listeners.get(i2);
                            i2++;
                            animatorListener.onAnimationCancel(animator4);
                        }
                    }
                }
            }
        }
    }

    @Override // com.adsurge.adn.p014d0.j
    public void pause() {
        if (!this.e || this.f) {
            return;
        }
        this.f = true;
        cancel();
    }

    @Override // com.adsurge.adn.p014d0.j
    public void resume() {
        if (this.f) {
            this.f = false;
            start();
        }
    }

    public k(String str, List list, i iVar) {
        int size;
        this.a = str;
        this.c = iVar;
        if (list != null && (size = list.size()) > 0) {
            Animator animator = (Animator) list.get(0);
            if (size == 1) {
                this.b = animator;
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(list);
            this.b = animatorSet;
            return;
        }
        this.b = null;
    }

    @Override // com.adsurge.adn.p014d0.j
    public void a(float f) {
    }

    @Override // com.adsurge.adn.p014d0.j
    public void a() {
        i iVar;
        ValueAnimator valueAnimator;
        c cVar = this.d;
        if (cVar == null || (iVar = this.c) == null || (valueAnimator = iVar.b) == null) {
            return;
        }
        valueAnimator.removeListener(cVar);
        this.d = null;
    }
}
