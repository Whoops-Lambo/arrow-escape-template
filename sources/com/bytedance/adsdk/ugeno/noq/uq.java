package com.bytedance.adsdk.ugeno.noq;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.h50;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
class uq {
    static final /* synthetic */ boolean rz = true;
    long[] ahm;
    private boolean[] ct;
    int[] kgy;
    private long[] noq;
    private final com.bytedance.adsdk.ugeno.noq.kgy uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm implements Comparable<ahm> {
        int ahm;
        int kgy;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int compareTo(ahm ahmVar) {
            int i = this.ahm;
            int i2 = ahmVar.ahm;
            return i != i2 ? i - i2 : this.kgy - ahmVar.kgy;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.ahm);
            sb.append(", index=");
            return h50.l(sb, this.kgy, '}');
        }

        private ahm() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        int ahm;
        List<rz> kgy;

        public void kgy() {
            this.kgy = null;
            this.ahm = 0;
        }
    }

    private void ahm(int i, int i2, rz rzVar, int i3, int i4, boolean z) {
        float f;
        float f2;
        int iMax;
        int iYo;
        int i5 = rzVar.ct;
        float f3 = rzVar.nu;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        rzVar.ct = i4 + rzVar.noq;
        if (!z) {
            rzVar.yo = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < rzVar.fi) {
            int i8 = rzVar.vs + i6;
            View viewAhm = this.uq.ahm(i8);
            if (viewAhm == null || viewAhm.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) viewAhm.getLayoutParams();
                int flexDirection = this.uq.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewAhm.getMeasuredWidth();
                    long[] jArr = this.noq;
                    if (jArr != null) {
                        measuredWidth = kgy(jArr[i8]);
                    }
                    int measuredHeight = viewAhm.getMeasuredHeight();
                    long[] jArr2 = this.noq;
                    f2 = f5;
                    if (jArr2 != null) {
                        measuredHeight = ahm(jArr2[i8]);
                    }
                    if (!this.ct[i8] && ahmVar.ct() > f) {
                        float fCt = measuredWidth - (ahmVar.ct() * f2);
                        if (i6 == rzVar.fi - 1) {
                            fCt += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fCt);
                        if (iRound < ahmVar.yo()) {
                            iYo = ahmVar.yo();
                            this.ct[i8] = true;
                            rzVar.nu -= ahmVar.ct();
                            z2 = true;
                        } else {
                            float f7 = (fCt - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iYo = iRound + 1;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iYo = iRound - 1;
                                f7 += 1.0f;
                            } else {
                                iYo = iRound;
                            }
                            f6 = f7;
                        }
                        int iAhm = ahm(i2, ahmVar, rzVar.twf);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iYo, 1073741824);
                        viewAhm.measure(iMakeMeasureSpec, iAhm);
                        int measuredWidth2 = viewAhm.getMeasuredWidth();
                        int measuredHeight2 = viewAhm.getMeasuredHeight();
                        kgy(i8, iMakeMeasureSpec, iAhm, viewAhm);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, ahmVar.dg() + ahmVar.kus() + measuredHeight + this.uq.kgy(viewAhm));
                    rzVar.ct = ahmVar.vs() + ahmVar.twf() + measuredWidth + rzVar.ct;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewAhm.getMeasuredHeight();
                    long[] jArr3 = this.noq;
                    if (jArr3 != null) {
                        measuredHeight3 = ahm(jArr3[i8]);
                    }
                    int measuredWidth3 = viewAhm.getMeasuredWidth();
                    long[] jArr4 = this.noq;
                    if (jArr4 != null) {
                        measuredWidth3 = kgy(jArr4[i8]);
                    }
                    if (!this.ct[i8] && ahmVar.ct() > f) {
                        float fCt2 = measuredHeight3 - (ahmVar.ct() * f5);
                        if (i6 == rzVar.fi - 1) {
                            fCt2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fCt2);
                        if (iRound2 < ahmVar.fi()) {
                            iRound2 = ahmVar.fi();
                            this.ct[i8] = true;
                            rzVar.nu -= ahmVar.ct();
                            z2 = true;
                        } else {
                            float f8 = (fCt2 - iRound2) + f6;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f8 += 1.0f;
                            }
                            f6 = f8;
                        }
                        int iKgy = kgy(i, ahmVar, rzVar.twf);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewAhm.measure(iKgy, iMakeMeasureSpec2);
                        int measuredWidth4 = viewAhm.getMeasuredWidth();
                        int measuredHeight4 = viewAhm.getMeasuredHeight();
                        kgy(i8, iKgy, iMakeMeasureSpec2, viewAhm);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, ahmVar.vs() + ahmVar.twf() + measuredWidth3 + this.uq.kgy(viewAhm));
                    rzVar.ct = ahmVar.dg() + ahmVar.kus() + measuredHeight3 + rzVar.ct;
                    f2 = f5;
                }
                rzVar.yo = Math.max(rzVar.yo, iMax);
                i7 = iMax;
            }
            i6++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i5 == rzVar.ct) {
            return;
        }
        ahm(i, i2, rzVar, i3, i4, true);
    }

    private int ct(com.bytedance.adsdk.ugeno.noq.ahm ahmVar, boolean z) {
        return z ? ahmVar.kus() : ahmVar.twf();
    }

    private int noq(com.bytedance.adsdk.ugeno.noq.ahm ahmVar, boolean z) {
        return z ? ahmVar.dg() : ahmVar.vs();
    }

    private void rz(int i) {
        boolean[] zArr = this.ct;
        if (zArr == null) {
            this.ct = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.ct = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private int uq(boolean z) {
        com.bytedance.adsdk.ugeno.noq.kgy kgyVar = this.uq;
        return z ? kgyVar.getPaddingBottom() : kgyVar.getPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void kgy(kgy kgyVar, int i, int i2, int i3, int i4, int i5, List<rz> list) {
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int iKgy;
        int i10;
        int i11;
        int i12;
        rz rzVar;
        int i13;
        int i14;
        boolean z2;
        int i15;
        int i16;
        int i17 = i;
        boolean zKgy = this.uq.kgy();
        int mode = View.MeasureSpec.getMode(i17);
        int size = View.MeasureSpec.getSize(i17);
        List<rz> arrayList = list == null ? new ArrayList() : list;
        kgyVar.kgy = arrayList;
        boolean z3 = i5 == -1;
        int iKgy2 = kgy(zKgy);
        int iAhm = ahm(zKgy);
        int iRz = rz(zKgy);
        int iUq = uq(zKgy);
        rz rzVar2 = new rz();
        int i18 = i4;
        rzVar2.vs = i18;
        int i19 = iKgy2 + iAhm;
        rzVar2.ct = i19;
        int flexItemCount = this.uq.getFlexItemCount();
        boolean z4 = z3;
        rz rzVar3 = rzVar2;
        int i20 = Integer.MIN_VALUE;
        int i21 = 0;
        int iCombineMeasuredStates = 0;
        int i22 = 0;
        while (i18 < flexItemCount) {
            View viewAhm = this.uq.ahm(i18);
            if (viewAhm == null) {
                if (kgy(i18, flexItemCount, rzVar3)) {
                    kgy(arrayList, rzVar3, i18, i21);
                }
                i7 = i19;
                z = true;
            } else {
                z = true;
                i7 = i19;
                if (viewAhm.getVisibility() == 8) {
                    rzVar3.gf++;
                    rzVar3.fi++;
                    if (kgy(i18, flexItemCount, rzVar3)) {
                        kgy(arrayList, rzVar3, i18, i21);
                    }
                } else {
                    if (viewAhm instanceof CompoundButton) {
                        kgy((CompoundButton) viewAhm);
                    }
                    com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) viewAhm.getLayoutParams();
                    int i23 = flexItemCount;
                    if (ahmVar.noq() == 4) {
                        rzVar3.kus.add(Integer.valueOf(i18));
                    }
                    int iKgy3 = kgy(ahmVar, zKgy);
                    if (ahmVar.at() != -1.0f && mode == 1073741824) {
                        iKgy3 = Math.round(ahmVar.at() * size);
                    }
                    com.bytedance.adsdk.ugeno.noq.kgy kgyVar2 = this.uq;
                    if (zKgy) {
                        iKgy = kgyVar2.kgy(i17, i7 + rz(ahmVar, true) + uq(ahmVar, true), iKgy3);
                        i8 = i21;
                        int iAhm2 = this.uq.ahm(i2, iRz + iUq + ct(ahmVar, true) + noq(ahmVar, true) + i21, ahm(ahmVar, true));
                        viewAhm.measure(iKgy, iAhm2);
                        kgy(i18, iKgy, iAhm2, viewAhm);
                        i9 = 0;
                    } else {
                        i8 = i21;
                        i9 = 0;
                        int iKgy4 = kgyVar2.kgy(i2, iRz + iUq + ct(ahmVar, false) + noq(ahmVar, false) + i8, ahm(ahmVar, false));
                        int iAhm3 = this.uq.ahm(i17, i7 + rz(ahmVar, false) + uq(ahmVar, false), iKgy3);
                        viewAhm.measure(iKgy4, iAhm3);
                        kgy(i18, iKgy4, iAhm3, viewAhm);
                        iKgy = iAhm3;
                    }
                    kgy(viewAhm, i18);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewAhm.getMeasuredState());
                    int i24 = i9;
                    i10 = i18;
                    int i25 = iKgy;
                    rz rzVar4 = rzVar3;
                    int i26 = i22;
                    i11 = i7;
                    i12 = i8;
                    boolean z5 = zKgy;
                    size = size;
                    if (kgy(viewAhm, mode, size, rzVar3.ct, kgy(viewAhm, zKgy) + rz(ahmVar, zKgy) + uq(ahmVar, zKgy), ahmVar, i10, i26, arrayList.size())) {
                        if (rzVar4.ahm() > 0) {
                            kgy(arrayList, rzVar4, i10 > 0 ? i10 - 1 : i24, i12);
                            i16 = i12 + rzVar4.yo;
                        } else {
                            i16 = i12;
                        }
                        if (z5) {
                            if (ahmVar.ahm() == -1) {
                                com.bytedance.adsdk.ugeno.noq.kgy kgyVar3 = this.uq;
                                viewAhm.measure(i25, kgyVar3.ahm(i2, ahmVar.dg() + ahmVar.kus() + kgyVar3.getPaddingTop() + this.uq.getPaddingBottom() + i16, ahmVar.ahm()));
                                kgy(viewAhm, i10);
                            }
                        } else if (ahmVar.kgy() == -1) {
                            com.bytedance.adsdk.ugeno.noq.kgy kgyVar4 = this.uq;
                            viewAhm.measure(kgyVar4.kgy(i2, ahmVar.vs() + ahmVar.twf() + kgyVar4.getPaddingLeft() + this.uq.getPaddingRight() + i16, ahmVar.kgy()), i25);
                            kgy(viewAhm, i10);
                        }
                        rz rzVar5 = new rz();
                        rzVar5.fi = 1;
                        rzVar5.ct = i11;
                        rzVar5.vs = i10;
                        i12 = i16;
                        i13 = i24;
                        rzVar = rzVar5;
                        i14 = Integer.MIN_VALUE;
                    } else {
                        rzVar = rzVar4;
                        rzVar.fi++;
                        i13 = i26 + 1;
                        i14 = i20;
                    }
                    rzVar.xh = (rzVar.xh ? 1 : 0) | (ahmVar.uq() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i24);
                    rzVar.um = (rzVar.um ? 1 : 0) | (ahmVar.ct() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i24);
                    int[] iArr = this.kgy;
                    if (iArr != null) {
                        iArr[i10] = arrayList.size();
                    }
                    z2 = z5;
                    rzVar.ct = kgy(viewAhm, z2) + rz(ahmVar, z2) + uq(ahmVar, z2) + rzVar.ct;
                    rzVar.ra = ahmVar.uq() + rzVar.ra;
                    rzVar.nu = ahmVar.ct() + rzVar.nu;
                    this.uq.kgy(viewAhm, i10, i13, rzVar);
                    int iMax = Math.max(i14, ahm(viewAhm, z2) + ct(ahmVar, z2) + noq(ahmVar, z2) + this.uq.kgy(viewAhm));
                    rzVar.yo = Math.max(rzVar.yo, iMax);
                    if (z2) {
                        int flexWrap = this.uq.getFlexWrap();
                        int i27 = rzVar.at;
                        if (flexWrap != 2) {
                            rzVar.at = Math.max(i27, ahmVar.kus() + viewAhm.getBaseline());
                        } else {
                            rzVar.at = Math.max(i27, ahmVar.dg() + (viewAhm.getMeasuredHeight() - viewAhm.getBaseline()));
                        }
                    }
                    i15 = i23;
                    if (kgy(i10, i15, rzVar)) {
                        kgy(arrayList, rzVar, i10, i12);
                        i12 += rzVar.yo;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (((rz) pv1.i(1, arrayList)).dg >= i5 && i10 >= i5 && !z4) {
                            i12 = -rzVar.kgy();
                            z4 = true;
                        }
                    }
                    if (i12 > i3 && z4) {
                        i6 = iCombineMeasuredStates;
                        kgyVar.ahm = i6;
                    } else {
                        i20 = iMax;
                        i22 = i13;
                    }
                }
                int i28 = i10 + 1;
                zKgy = z2;
                rzVar3 = rzVar;
                i19 = i11;
                i21 = i12;
                i17 = i;
                flexItemCount = i15;
                i18 = i28;
                mode = mode;
            }
            i10 = i18;
            mode = mode;
            i15 = flexItemCount;
            i12 = i21;
            z2 = zKgy;
            i11 = i7;
            rzVar = rzVar3;
            int i29 = i10 + 1;
            zKgy = z2;
            rzVar3 = rzVar;
            i19 = i11;
            i21 = i12;
            i17 = i;
            flexItemCount = i15;
            i18 = i29;
            mode = mode;
        }
        i6 = iCombineMeasuredStates;
        kgyVar.ahm = i6;
    }

    public uq(com.bytedance.adsdk.ugeno.noq.kgy kgyVar) {
        this.uq = kgyVar;
    }

    private int uq(com.bytedance.adsdk.ugeno.noq.ahm ahmVar, boolean z) {
        if (z) {
            return ahmVar.vs();
        }
        return ahmVar.dg();
    }

    private int rz(com.bytedance.adsdk.ugeno.noq.ahm ahmVar, boolean z) {
        if (z) {
            return ahmVar.twf();
        }
        return ahmVar.kus();
    }

    private int rz(boolean z) {
        com.bytedance.adsdk.ugeno.noq.kgy kgyVar = this.uq;
        if (z) {
            return kgyVar.getPaddingTop();
        }
        return kgyVar.getPaddingStart();
    }

    public long ahm(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    private List<ahm> ahm(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) this.uq.kgy(i2).getLayoutParams();
            ahm ahmVar2 = new ahm();
            ahmVar2.ahm = ahmVar.rz();
            ahmVar2.kgy = i2;
            arrayList.add(ahmVar2);
        }
        return arrayList;
    }

    public boolean ahm(SparseIntArray sparseIntArray) {
        int flexItemCount = this.uq.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewKgy = this.uq.kgy(i);
            if (viewKgy != null && ((com.bytedance.adsdk.ugeno.noq.ahm) viewKgy.getLayoutParams()).rz() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void ahm(kgy kgyVar, int i, int i2) {
        kgy(kgyVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<rz>) null);
    }

    private int ahm(boolean z) {
        com.bytedance.adsdk.ugeno.noq.kgy kgyVar = this.uq;
        if (z) {
            return kgyVar.getPaddingEnd();
        }
        return kgyVar.getPaddingBottom();
    }

    private int ahm(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int ahm(com.bytedance.adsdk.ugeno.noq.ahm ahmVar, boolean z) {
        if (z) {
            return ahmVar.ahm();
        }
        return ahmVar.kgy();
    }

    public int ahm(long j) {
        return (int) (j >> 32);
    }

    private int ahm(int i, com.bytedance.adsdk.ugeno.noq.ahm ahmVar, int i2) {
        com.bytedance.adsdk.ugeno.noq.kgy kgyVar = this.uq;
        int iAhm = kgyVar.ahm(i, ahmVar.dg() + ahmVar.kus() + kgyVar.getPaddingTop() + this.uq.getPaddingBottom() + i2, ahmVar.ahm());
        int size = View.MeasureSpec.getSize(iAhm);
        if (size > ahmVar.ra()) {
            return View.MeasureSpec.makeMeasureSpec(ahmVar.ra(), View.MeasureSpec.getMode(iAhm));
        }
        return size < ahmVar.fi() ? View.MeasureSpec.makeMeasureSpec(ahmVar.fi(), View.MeasureSpec.getMode(iAhm)) : iAhm;
    }

    public void ahm(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.uq.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            d.r("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<rz> flexLinesInternal = this.uq.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.uq.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).yo = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.uq.getAlignContent();
                if (alignContent == 1) {
                    rz rzVar = new rz();
                    rzVar.yo = size - sumOfCrossSize;
                    flexLinesInternal.add(0, rzVar);
                    return;
                }
                if (alignContent == 2) {
                    this.uq.setFlexLines(kgy(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i4 < size4) {
                            arrayList.add(flexLinesInternal.get(i4));
                            if (i4 != flexLinesInternal.size() - 1) {
                                rz rzVar2 = new rz();
                                if (i4 == flexLinesInternal.size() - 2) {
                                    rzVar2.yo = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    rzVar2.yo = Math.round(size3);
                                }
                                int i5 = rzVar2.yo;
                                float f2 = (size3 - i5) + f;
                                if (f2 > 1.0f) {
                                    rzVar2.yo = i5 + 1;
                                    f2 -= 1.0f;
                                } else if (f2 < -1.0f) {
                                    rzVar2.yo = i5 - 1;
                                    f2 += 1.0f;
                                }
                                f = f2;
                                arrayList.add(rzVar2);
                            }
                            i4++;
                        }
                        this.uq.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.uq.setFlexLines(kgy(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    rz rzVar3 = new rz();
                    rzVar3.yo = size5;
                    for (rz rzVar4 : flexLinesInternal) {
                        arrayList2.add(rzVar3);
                        arrayList2.add(rzVar4);
                        arrayList2.add(rzVar3);
                    }
                    this.uq.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        rz rzVar5 = flexLinesInternal.get(i4);
                        float f4 = rzVar5.yo + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        float f5 = (f4 - iRound) + f3;
                        if (f5 > 1.0f) {
                            iRound++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        rzVar5.yo = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    private void ahm(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - ahmVar.twf()) - ahmVar.vs()) - this.uq.kgy(view), ahmVar.yo()), ahmVar.gf());
        long[] jArr = this.noq;
        if (jArr != null) {
            measuredHeight = ahm(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        kgy(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] kgy(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.uq.getFlexItemCount();
        List<ahm> listAhm = ahm(flexItemCount);
        ahm ahmVar = new ahm();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.noq.ahm)) {
            ahmVar.ahm = ((com.bytedance.adsdk.ugeno.noq.ahm) layoutParams).rz();
        } else {
            ahmVar.ahm = 1;
        }
        if (i != -1 && i != flexItemCount && i < this.uq.getFlexItemCount()) {
            ahmVar.kgy = i;
            while (i < flexItemCount) {
                listAhm.get(i).kgy++;
                i++;
            }
        } else {
            ahmVar.kgy = flexItemCount;
        }
        listAhm.add(ahmVar);
        return kgy(flexItemCount + 1, listAhm, sparseIntArray);
    }

    public int[] kgy(SparseIntArray sparseIntArray) {
        int flexItemCount = this.uq.getFlexItemCount();
        return kgy(flexItemCount, ahm(flexItemCount), sparseIntArray);
    }

    private int[] kgy(int i, List<ahm> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (ahm ahmVar : list) {
            int i3 = ahmVar.kgy;
            iArr[i2] = i3;
            sparseIntArray.append(i3, ahmVar.ahm);
            i2++;
        }
        return iArr;
    }

    public void kgy(kgy kgyVar, int i, int i2) {
        kgy(kgyVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<rz>) null);
    }

    public int kgy(long j) {
        return (int) j;
    }

    private void kgy(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) compoundButton.getLayoutParams();
        int iYo = ahmVar.yo();
        int iFi = ahmVar.fi();
        Drawable drawableKgy = com.bytedance.adsdk.ugeno.fi.ct.kgy(compoundButton);
        int minimumWidth = drawableKgy == null ? 0 : drawableKgy.getMinimumWidth();
        int minimumHeight = drawableKgy != null ? drawableKgy.getMinimumHeight() : 0;
        if (iYo == -1) {
            iYo = minimumWidth;
        }
        ahmVar.kgy(iYo);
        if (iFi == -1) {
            iFi = minimumHeight;
        }
        ahmVar.ahm(iFi);
    }

    private int kgy(boolean z) {
        com.bytedance.adsdk.ugeno.noq.kgy kgyVar = this.uq;
        if (z) {
            return kgyVar.getPaddingStart();
        }
        return kgyVar.getPaddingTop();
    }

    private int kgy(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int kgy(com.bytedance.adsdk.ugeno.noq.ahm ahmVar, boolean z) {
        if (z) {
            return ahmVar.kgy();
        }
        return ahmVar.ahm();
    }

    private boolean kgy(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.noq.ahm ahmVar, int i5, int i6, int i7) {
        if (this.uq.getFlexWrap() == 0) {
            return false;
        }
        if (ahmVar.nu()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.uq.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iKgy = this.uq.kgy(view, i5, i6);
        if (iKgy > 0) {
            i4 += iKgy;
        }
        return i2 < i3 + i4;
    }

    private boolean kgy(int i, int i2, rz rzVar) {
        return i == i2 - 1 && rzVar.ahm() != 0;
    }

    private void kgy(List<rz> list, rz rzVar, int i, int i2) {
        rzVar.twf = i2;
        this.uq.kgy(rzVar);
        rzVar.dg = i;
        list.add(rzVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void kgy(View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < ahmVar.yo()) {
            measuredWidth = ahmVar.yo();
        } else {
            if (measuredWidth > ahmVar.gf()) {
                measuredWidth = ahmVar.gf();
            } else {
                z = false;
            }
            if (measuredHeight < ahmVar.fi()) {
                measuredHeight = ahmVar.fi();
            } else if (measuredHeight > ahmVar.ra()) {
                measuredHeight = ahmVar.ra();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                kgy(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z = true;
        if (measuredHeight < ahmVar.fi()) {
            measuredHeight = ahmVar.fi();
        } else if (measuredHeight > ahmVar.ra()) {
            measuredHeight = ahmVar.ra();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            kgy(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    public void kgy(int i, int i2) {
        kgy(i, i2, 0);
    }

    public void kgy(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        uq uqVar;
        rz(this.uq.getFlexItemCount());
        if (i3 >= this.uq.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.uq.getFlexDirection();
        int flexDirection2 = this.uq.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.uq.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.uq.getPaddingLeft();
            paddingRight = this.uq.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                d.r("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.uq.getLargestMainSize();
            }
            paddingLeft = this.uq.getPaddingTop();
            paddingRight = this.uq.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        int[] iArr = this.kgy;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<rz> flexLinesInternal = this.uq.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            rz rzVar = flexLinesInternal.get(i8);
            int i9 = rzVar.ct;
            if (i9 < i7 && rzVar.xh) {
                uqVar = this;
                i4 = i;
                i5 = i2;
                uqVar.kgy(i4, i5, rzVar, i7, i6, false);
            } else {
                i4 = i;
                i5 = i2;
                if (i9 <= i7 || !rzVar.um) {
                    uqVar = this;
                } else {
                    uqVar = this;
                    uqVar.ahm(i4, i5, rzVar, i7, i6, false);
                }
            }
            i8++;
            this = uqVar;
            i = i4;
            i2 = i5;
        }
    }

    private void kgy(int i, int i2, rz rzVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        int iMax;
        double d;
        double d2;
        float f3 = rzVar.ra;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 < (i5 = rzVar.ct)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        rzVar.ct = i4 + rzVar.noq;
        if (!z) {
            rzVar.yo = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < rzVar.fi) {
            int i8 = rzVar.vs + i6;
            View viewAhm = this.uq.ahm(i8);
            if (viewAhm == null || viewAhm.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z2 = z2;
            } else {
                com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) viewAhm.getLayoutParams();
                int flexDirection = this.uq.getFlexDirection();
                f = f4;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewAhm.getMeasuredHeight();
                    long[] jArr = this.noq;
                    if (jArr != null) {
                        measuredHeight = ahm(jArr[i8]);
                    }
                    int measuredWidth = viewAhm.getMeasuredWidth();
                    long[] jArr2 = this.noq;
                    f2 = f5;
                    boolean z3 = z2;
                    if (jArr2 != null) {
                        measuredWidth = kgy(jArr2[i8]);
                    }
                    if (this.ct[i8] || ahmVar.uq() <= f) {
                        z2 = z3;
                    } else {
                        float fUq = (ahmVar.uq() * f2) + measuredHeight;
                        if (i6 == rzVar.fi - 1) {
                            fUq += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fUq);
                        if (iRound > ahmVar.ra()) {
                            iRound = ahmVar.ra();
                            this.ct[i8] = true;
                            rzVar.ra -= ahmVar.uq();
                            z2 = true;
                        } else {
                            float f7 = (fUq - iRound) + f6;
                            double d3 = f7;
                            if (d3 > 1.0d) {
                                iRound++;
                                d2 = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d2 = d3 + 1.0d;
                                }
                                f6 = f7;
                                z2 = z3;
                            }
                            f7 = (float) d2;
                            f6 = f7;
                            z2 = z3;
                        }
                        int iKgy = kgy(i, ahmVar, rzVar.twf);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewAhm.measure(iKgy, iMakeMeasureSpec);
                        int measuredWidth2 = viewAhm.getMeasuredWidth();
                        int measuredHeight2 = viewAhm.getMeasuredHeight();
                        kgy(i8, iKgy, iMakeMeasureSpec, viewAhm);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i7, ahmVar.vs() + ahmVar.twf() + measuredWidth + this.uq.kgy(viewAhm));
                    rzVar.ct = ahmVar.dg() + ahmVar.kus() + measuredHeight + rzVar.ct;
                } else {
                    f2 = f5;
                    boolean z4 = z2;
                    int measuredWidth3 = viewAhm.getMeasuredWidth();
                    long[] jArr3 = this.noq;
                    if (jArr3 != null) {
                        measuredWidth3 = kgy(jArr3[i8]);
                    }
                    int measuredHeight3 = viewAhm.getMeasuredHeight();
                    long[] jArr4 = this.noq;
                    if (jArr4 != null) {
                        measuredHeight3 = ahm(jArr4[i8]);
                    }
                    if (this.ct[i8] || ahmVar.uq() <= f) {
                        z2 = z4;
                    } else {
                        float fUq2 = (ahmVar.uq() * f2) + measuredWidth3;
                        if (i6 == rzVar.fi - 1) {
                            fUq2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fUq2);
                        if (iRound2 > ahmVar.gf()) {
                            iRound2 = ahmVar.gf();
                            this.ct[i8] = true;
                            rzVar.ra -= ahmVar.uq();
                            z2 = true;
                        } else {
                            float f8 = (fUq2 - iRound2) + f6;
                            double d4 = f8;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d = d4 + 1.0d;
                                }
                                f6 = f8;
                                z2 = z4;
                            }
                            f8 = (float) d;
                            f6 = f8;
                            z2 = z4;
                        }
                        int iAhm = ahm(i2, ahmVar, rzVar.twf);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewAhm.measure(iMakeMeasureSpec2, iAhm);
                        int measuredWidth4 = viewAhm.getMeasuredWidth();
                        int measuredHeight4 = viewAhm.getMeasuredHeight();
                        kgy(i8, iMakeMeasureSpec2, iAhm, viewAhm);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i7, ahmVar.dg() + ahmVar.kus() + measuredHeight3 + this.uq.kgy(viewAhm));
                    rzVar.ct = ahmVar.vs() + ahmVar.twf() + measuredWidth3 + rzVar.ct;
                    iMax = iMax2;
                }
                rzVar.yo = Math.max(rzVar.yo, iMax);
                i7 = iMax;
            }
            i6++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i5 == rzVar.ct) {
            return;
        }
        kgy(i, i2, rzVar, i3, i4, true);
    }

    private int kgy(int i, com.bytedance.adsdk.ugeno.noq.ahm ahmVar, int i2) {
        com.bytedance.adsdk.ugeno.noq.kgy kgyVar = this.uq;
        int iKgy = kgyVar.kgy(i, ahmVar.vs() + ahmVar.twf() + kgyVar.getPaddingLeft() + this.uq.getPaddingRight() + i2, ahmVar.kgy());
        int size = View.MeasureSpec.getSize(iKgy);
        if (size > ahmVar.gf()) {
            return View.MeasureSpec.makeMeasureSpec(ahmVar.gf(), View.MeasureSpec.getMode(iKgy));
        }
        return size < ahmVar.yo() ? View.MeasureSpec.makeMeasureSpec(ahmVar.yo(), View.MeasureSpec.getMode(iKgy)) : iKgy;
    }

    private List<rz> kgy(List<rz> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        rz rzVar = new rz();
        rzVar.yo = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(rzVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(rzVar);
            }
        }
        return arrayList;
    }

    public void kgy() {
        kgy(0);
    }

    public void kgy(int i) {
        View viewAhm;
        if (i >= this.uq.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.uq.getFlexDirection();
        if (this.uq.getAlignItems() == 4) {
            int[] iArr = this.kgy;
            List<rz> flexLinesInternal = this.uq.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                rz rzVar = flexLinesInternal.get(i2);
                int i3 = rzVar.fi;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = rzVar.vs + i4;
                    if (i4 < this.uq.getFlexItemCount() && (viewAhm = this.uq.ahm(i5)) != null && viewAhm.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) viewAhm.getLayoutParams();
                        if (ahmVar.noq() == -1 || ahmVar.noq() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    d.r("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                    return;
                                }
                                ahm(viewAhm, rzVar.yo, i5);
                            } else {
                                kgy(viewAhm, rzVar.yo, i5);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (rz rzVar2 : this.uq.getFlexLinesInternal()) {
            for (Integer num : rzVar2.kus) {
                View viewAhm2 = this.uq.ahm(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        d.r("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                        return;
                    }
                    ahm(viewAhm2, rzVar2.yo, num.intValue());
                } else {
                    kgy(viewAhm2, rzVar2.yo, num.intValue());
                }
            }
        }
    }

    private void kgy(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - ahmVar.kus()) - ahmVar.dg()) - this.uq.kgy(view), ahmVar.fi()), ahmVar.ra());
        long[] jArr = this.noq;
        if (jArr != null) {
            measuredWidth = kgy(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        kgy(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void kgy(View view, rz rzVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) view.getLayoutParams();
        int alignItems = this.uq.getAlignItems();
        if (ahmVar.noq() != -1) {
            alignItems = ahmVar.noq();
        }
        int i5 = rzVar.yo;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.uq.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - ahmVar.dg(), i3, i6 - ahmVar.dg());
                    return;
                }
                int measuredHeight = view.getMeasuredHeight();
                int iKus = ahmVar.kus() + measuredHeight + (i2 - i5);
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, iKus, i3, ahmVar.kus() + measuredHeight2 + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int iKus2 = ((ahmVar.kus() + (i5 - view.getMeasuredHeight())) - ahmVar.dg()) / 2;
                if (this.uq.getFlexWrap() != 2) {
                    int i7 = i2 + iKus2;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - iKus2;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = this.uq.getFlexWrap();
                int i9 = rzVar.at;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), ahmVar.kus());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), ahmVar.dg());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.uq.getFlexWrap() != 2) {
            view.layout(i, ahmVar.kus() + i2, i3, ahmVar.kus() + i4);
        } else {
            view.layout(i, i2 - ahmVar.dg(), i3, i4 - ahmVar.dg());
        }
    }

    public void kgy(View view, rz rzVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.noq.ahm ahmVar = (com.bytedance.adsdk.ugeno.noq.ahm) view.getLayoutParams();
        int alignItems = this.uq.getAlignItems();
        if (ahmVar.noq() != -1) {
            alignItems = ahmVar.noq();
        }
        int i5 = rzVar.yo;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - ahmVar.vs(), i2, ((i3 + i5) - view.getMeasuredWidth()) - ahmVar.vs(), i4);
                    return;
                }
                int measuredWidth = view.getMeasuredWidth();
                view.layout(ahmVar.twf() + measuredWidth + (i - i5), i2, ahmVar.twf() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iKgy = ((com.bytedance.adsdk.ugeno.fi.noq.kgy(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.fi.noq.ahm(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + iKgy, i2, i3 + iKgy, i4);
                    return;
                } else {
                    view.layout(i - iKgy, i2, i3 - iKgy, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(ahmVar.twf() + i, i2, ahmVar.twf() + i3, i4);
        } else {
            view.layout(i - ahmVar.vs(), i2, i3 - ahmVar.vs(), i4);
        }
    }

    private void kgy(int i, int i2, int i3, View view) {
        long[] jArr = this.ahm;
        if (jArr != null) {
            jArr[i] = ahm(i2, i3);
        }
        long[] jArr2 = this.noq;
        if (jArr2 != null) {
            jArr2[i] = ahm(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
