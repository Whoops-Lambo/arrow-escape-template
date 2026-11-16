package com.adsurge.adn.p014d0;

import android.animation.Animator;
import android.animation.TimeAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class l extends TimeAnimator implements j, TimeAnimator.TimeListener, Animator.AnimatorListener {
    public final String a;
    public final int b;
    public final LinkedList c;
    public LinkedList d;
    public b e;
    public float f = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a implements j.a {
        public final String a;
        public final LinkedList b = new LinkedList();
        public int c = 0;

        @Override // com.adsurge.adn.d0.j.a
        public void a(i iVar) {
            int i = iVar.a.k;
            int i2 = this.c;
            if (i2 >= 0) {
                if (i < 0) {
                    this.c = -1;
                } else if (i > i2) {
                    this.c = i;
                }
            }
            this.b.add(iVar);
        }

        public a(String str) {
            this.a = str;
        }

        @Override // com.adsurge.adn.d0.j.a
        public j a() {
            return new l(this.a, this.c, this.b);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        a(j, true, false);
    }

    @Override // android.animation.TimeAnimator, android.animation.ValueAnimator, android.animation.Animator, com.adsurge.adn.p014d0.j
    public void start() {
        a((b) null);
    }

    public final void a(long j, boolean z, boolean z2) {
        float f;
        long j2;
        long j3;
        long j4;
        float f2;
        if (com.adsurge.adn.J0.a.a || this.d != null) {
            LinkedList linkedList = this.d;
            Iterator itDescendingIterator = z2 ? linkedList.descendingIterator() : linkedList.iterator();
            while (itDescendingIterator.hasNext()) {
                i iVar = (i) itDescendingIterator.next();
                com.adsurge.adn.p026h0.a aVar = iVar.a;
                long j5 = aVar.d;
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (j5 < j) {
                    int i = aVar.e;
                    if (i <= 0) {
                        if (!z2) {
                            f3 = 1.0f;
                        }
                        iVar.a(f3);
                        if (z) {
                            itDescendingIterator.remove();
                        }
                    } else {
                        int i2 = aVar.k;
                        if (i2 < 0 || j < i2) {
                            long j6 = j - ((long) aVar.l);
                            if (j6 > 0) {
                                f = 1.0f;
                                j2 = j6;
                                j3 = 0;
                                j4 = (j2 % ((long) aVar.m)) - ((long) aVar.f);
                                if (j4 > 0 || iVar.d) {
                                }
                            } else {
                                f = 1.0f;
                                j2 = j6;
                                j3 = 0;
                                j4 = 0;
                            }
                            if (j6 <= 0) {
                                f2 = ((j - j5) * f) / i;
                                iVar.d = j6 != 0;
                            } else if (j4 > j3) {
                                f2 = ((int) (j2 / ((long) aVar.m))) + 1 + ((j4 * f) / i);
                                iVar.d = j4 != ((long) i);
                            } else {
                                if (!z2 || !aVar.d()) {
                                    f3 = ((int) (j2 / ((long) aVar.m))) + 1;
                                }
                                iVar.d = false;
                                f2 = f3;
                            }
                            iVar.a(f2);
                        } else {
                            iVar.a(aVar.g + 1.0f);
                            iVar.d = false;
                            if (z) {
                                itDescendingIterator.remove();
                            }
                        }
                    }
                } else if (iVar.d || !z) {
                    iVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    iVar.d = false;
                }
            }
            if (z && this.d.size() == 0) {
                this.d = null;
                end();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(this.a);
        }
    }

    public l(String str, int i, LinkedList linkedList) {
        this.a = str;
        this.b = i;
        this.c = linkedList;
        setTimeListener(this);
    }

    @Override // com.adsurge.adn.p014d0.j
    public void a(float f) {
        int i;
        if (this.b < 0 || f == this.f) {
            return;
        }
        if (isStarted()) {
            this.d = null;
            cancel();
        }
        if (f > 1.0f) {
            i = this.b;
        } else {
            i = f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : (int) (this.b * f);
        }
        if (this.d == null) {
            this.d = (LinkedList) this.c.clone();
        }
        a(i, false, f < this.f);
        this.f = f;
    }

    @Override // com.adsurge.adn.p014d0.j
    public void a(b bVar) {
        this.d = (LinkedList) this.c.clone();
        b bVar2 = this.e;
        if (bVar != null) {
            if (bVar2 == null) {
                addListener(this);
            }
            this.e = bVar;
        } else if (bVar2 != null) {
            this.e = null;
            removeListener(this);
        }
        super.start();
    }

    @Override // com.adsurge.adn.p014d0.j
    public void a() {
        if (this.e != null) {
            removeListener(this);
            this.e = null;
        }
    }
}
