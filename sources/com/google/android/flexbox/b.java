package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pv1;
import defpackage.to0;
import defpackage.uo0;
import defpackage.vo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final to0 a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;

    public static ArrayList e(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add((a) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final void a(List list, a aVar, int i, int i2) {
        aVar.m = i2;
        this.a.h(aVar);
        aVar.p = i;
        list.add(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    public final void b(uo0 uo0Var, int i, int i2, int i3, int i4, int i5, List list) {
        int iC;
        FlexItem flexItem;
        int i6;
        boolean z;
        int i7 = i;
        to0 to0Var = this.a;
        boolean zJ = to0Var.j();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        List arrayList = list == null ? new ArrayList() : list;
        uo0Var.c = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zJ ? to0Var.getPaddingStart() : to0Var.getPaddingTop();
        int paddingEnd = zJ ? to0Var.getPaddingEnd() : to0Var.getPaddingBottom();
        int paddingTop = zJ ? to0Var.getPaddingTop() : to0Var.getPaddingStart();
        int paddingBottom = zJ ? to0Var.getPaddingBottom() : to0Var.getPaddingEnd();
        a aVar = new a();
        int i8 = i4;
        int i9 = 1;
        aVar.o = i8;
        int i10 = paddingStart + paddingEnd;
        aVar.e = i10;
        int flexItemCount = to0Var.getFlexItemCount();
        boolean z3 = z2;
        int i11 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i12 = 0;
        int i13 = 0;
        while (i8 < flexItemCount) {
            int i14 = flexItemCount;
            View viewE = to0Var.e(i8);
            if (viewE != null) {
                if (viewE.getVisibility() == 8) {
                    aVar.i++;
                    aVar.h++;
                    if (i8 == i14 - 1 && aVar.a() != 0) {
                        a(arrayList, aVar, i8, i12);
                    }
                } else {
                    if (viewE instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewE;
                        FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                        int minWidth = flexItem2.getMinWidth();
                        int minHeight = flexItem2.getMinHeight();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (minWidth == -1) {
                            minWidth = minimumWidth;
                        }
                        flexItem2.setMinWidth(minWidth);
                        if (minHeight == -1) {
                            minHeight = minimumHeight;
                        }
                        flexItem2.T(minHeight);
                    }
                    FlexItem flexItem3 = (FlexItem) viewE.getLayoutParams();
                    if (flexItem3.t() == 4) {
                        aVar.n.add(Integer.valueOf(i8));
                    }
                    int width = zJ ? flexItem3.getWidth() : flexItem3.getHeight();
                    if (flexItem3.X() != -1.0f && mode == 1073741824) {
                        width = Math.round(size * flexItem3.X());
                    }
                    if (zJ) {
                        iC = to0Var.g(i7, i10 + flexItem3.n0() + flexItem3.s0(), width);
                        int iC2 = to0Var.c(i2, paddingTop + paddingBottom + flexItem3.k() + flexItem3.r() + i12, flexItem3.getHeight());
                        viewE.measure(iC, iC2);
                        v(i8, iC, iC2, viewE);
                    } else {
                        int iG = to0Var.g(i2, paddingTop + paddingBottom + flexItem3.n0() + flexItem3.s0() + i12, flexItem3.getWidth());
                        iC = to0Var.c(i7, i10 + flexItem3.k() + flexItem3.r(), width);
                        viewE.measure(iG, iC);
                        v(i8, iG, iC, viewE);
                    }
                    to0Var.i(i8, viewE);
                    c(i8, viewE);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewE.getMeasuredState());
                    int i15 = aVar.e;
                    int measuredWidth = (zJ ? viewE.getMeasuredWidth() : viewE.getMeasuredHeight()) + (zJ ? flexItem3.n0() : flexItem3.k()) + (zJ ? flexItem3.s0() : flexItem3.r());
                    int size2 = arrayList.size();
                    if (to0Var.getFlexWrap() != 0) {
                        if (flexItem3.Y()) {
                            flexItem = flexItem3;
                        } else {
                            if (mode == 0) {
                                flexItem = flexItem3;
                            } else {
                                flexItem = flexItem3;
                                int maxLine = to0Var.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int iF = to0Var.f(viewE, i8, i13);
                                    if (iF > 0) {
                                        measuredWidth += iF;
                                    }
                                    if (size < i15 + measuredWidth) {
                                    }
                                }
                            }
                            i10 = i10;
                            arrayList = arrayList;
                            aVar.h += i9;
                            i13++;
                            i6 = i11;
                        }
                        if (aVar.a() > 0) {
                            arrayList = arrayList;
                            a(arrayList, aVar, i8 > 0 ? i8 - 1 : 0, i12);
                            i12 += aVar.g;
                        }
                        if (zJ) {
                            arrayList = arrayList;
                            if (flexItem.getHeight() == -1) {
                                viewE.measure(iC, to0Var.c(i2, to0Var.getPaddingBottom() + to0Var.getPaddingTop() + flexItem.k() + flexItem.r() + i12, flexItem.getHeight()));
                                c(i8, viewE);
                            }
                        } else {
                            arrayList = arrayList;
                            if (flexItem.getWidth() == -1) {
                                viewE.measure(to0Var.g(i2, to0Var.getPaddingRight() + to0Var.getPaddingLeft() + flexItem.n0() + flexItem.s0() + i12, flexItem.getWidth()), iC);
                                c(i8, viewE);
                            }
                        }
                        aVar = new a();
                        aVar.h = i9;
                        i10 = i10;
                        aVar.e = i10;
                        aVar.o = i8;
                        i6 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        flexItem = flexItem3;
                        i10 = i10;
                        arrayList = arrayList;
                        aVar.h += i9;
                        i13++;
                        i6 = i11;
                    }
                    aVar.q |= flexItem.U() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    aVar.r |= flexItem.L() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    int[] iArr = this.c;
                    if (iArr != null) {
                        iArr[i8] = arrayList.size();
                    }
                    aVar.e = (zJ ? viewE.getMeasuredWidth() : viewE.getMeasuredHeight()) + (zJ ? flexItem.n0() : flexItem.k()) + (zJ ? flexItem.s0() : flexItem.r()) + aVar.e;
                    aVar.j += flexItem.U();
                    aVar.k += flexItem.L();
                    to0Var.a(viewE, i8, i13, aVar);
                    int iMax = Math.max(i6, to0Var.d(viewE) + (zJ ? viewE.getMeasuredHeight() : viewE.getMeasuredWidth()) + (zJ ? flexItem.k() : flexItem.n0()) + (zJ ? flexItem.r() : flexItem.s0()));
                    aVar.g = Math.max(aVar.g, iMax);
                    if (zJ) {
                        int flexWrap = to0Var.getFlexWrap();
                        int i16 = aVar.l;
                        i11 = iMax;
                        if (flexWrap != 2) {
                            aVar.l = Math.max(i16, viewE.getBaseline() + flexItem.k());
                        } else {
                            aVar.l = Math.max(i16, (viewE.getMeasuredHeight() - viewE.getBaseline()) + flexItem.r());
                        }
                    } else {
                        i11 = iMax;
                    }
                    if (i8 == i14 - 1 && aVar.a() != 0) {
                        a(arrayList, aVar, i8, i12);
                        i12 += aVar.g;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (((a) pv1.i(1, arrayList)).p >= i5 && i8 >= i5 && !z3) {
                            i12 = -aVar.g;
                            z = true;
                        }
                        if (i12 > i3 && z) {
                            break;
                        }
                    }
                    z = z3;
                    if (i12 > i3) {
                        continue;
                    }
                }
                i8++;
                i7 = i;
                z3 = z;
                flexItemCount = i14;
                i9 = 1;
            } else if (i8 == i14 - 1 && aVar.a() != 0) {
                a(arrayList, aVar, i8, i12);
            }
            z = z3;
            i8++;
            i7 = i;
            z3 = z;
            flexItemCount = i14;
            i9 = 1;
        }
        uo0Var.b = iCombineMeasuredStates;
    }

    public final void d(int i, List list) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final ArrayList f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.a.b(i2).getLayoutParams();
            vo0 vo0Var = new vo0();
            vo0Var.b = flexItem.getOrder();
            vo0Var.a = i2;
            arrayList.add(vo0Var);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int mode;
        int size;
        to0 to0Var = this.a;
        int flexDirection = to0Var.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            defpackage.d.r(pv1.k(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<a> flexLinesInternal = to0Var.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = to0Var.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((a) flexLinesInternal.get(0)).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = to0Var.getAlignContent();
                if (alignContent == 1) {
                    a aVar = new a();
                    aVar.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, aVar);
                    return;
                }
                if (alignContent == 2) {
                    to0Var.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((a) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            a aVar2 = new a();
                            if (i4 == flexLinesInternal.size() - 2) {
                                aVar2.g = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                aVar2.g = Math.round(size3);
                            }
                            int i5 = aVar2.g;
                            float f2 = (size3 - i5) + f;
                            if (f2 > 1.0f) {
                                aVar2.g = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                aVar2.g = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(aVar2);
                        }
                        i4++;
                    }
                    to0Var.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        to0Var.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    a aVar3 = new a();
                    aVar3.g = size5;
                    for (a aVar4 : flexLinesInternal) {
                        arrayList2.add(aVar3);
                        arrayList2.add(aVar4);
                        arrayList2.add(aVar3);
                    }
                    to0Var.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        a aVar5 = (a) flexLinesInternal.get(i4);
                        float f4 = aVar5.g + size6;
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
                        aVar5.g = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        b bVar;
        int i4;
        int i5;
        to0 to0Var = this.a;
        int flexItemCount = to0Var.getFlexItemCount();
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= to0Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = to0Var.getFlexDirection();
        int flexDirection2 = to0Var.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = to0Var.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = to0Var.getPaddingLeft();
            paddingRight = to0Var.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                defpackage.d.r(pv1.k(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = to0Var.getLargestMainSize();
            }
            paddingLeft = to0Var.getPaddingTop();
            paddingRight = to0Var.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.c;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = to0Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            a aVar = (a) flexLinesInternal.get(i8);
            int i9 = aVar.e;
            if (i9 >= i7 || !aVar.q) {
                bVar = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && aVar.r) {
                    bVar.q(i4, i5, aVar, i7, i6, false);
                }
            } else {
                bVar = this;
                i4 = i;
                i5 = i2;
                bVar.l(i4, i5, aVar, i7, i6, false);
            }
            i8++;
            this = bVar;
            i = i4;
            i2 = i5;
        }
    }

    public final void i(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i));
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    public final void l(int i, int i2, a aVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        boolean z2;
        int i6;
        int iMax;
        double d;
        boolean z3;
        double d2;
        float f3 = aVar.j;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 < (i5 = aVar.e)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        float f6 = 0.0f;
        while (i7 < aVar.h) {
            int i9 = aVar.o + i7;
            to0 to0Var = this.a;
            View viewE = to0Var.e(i9);
            if (viewE == null || viewE.getVisibility() == 8) {
                f = f4;
                i5 = i5;
                f2 = f5;
                z2 = z4;
                i6 = i7;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = to0Var.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i5;
                    float f7 = f5;
                    z2 = z4;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i9] >> 32);
                    }
                    if (this.b[i9] || flexItem.U() <= f) {
                        i6 = i7;
                        f2 = f7;
                    } else {
                        float fU = (f7 * flexItem.U()) + measuredWidth;
                        if (i7 == aVar.h - 1) {
                            fU += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fU);
                        if (iRound > flexItem.b0()) {
                            iRound = flexItem.b0();
                            this.b[i9] = true;
                            aVar.j -= flexItem.U();
                            z2 = true;
                            i6 = i7;
                            f2 = f7;
                        } else {
                            float f8 = (fU - iRound) + f6;
                            i6 = i7;
                            f2 = f7;
                            double d3 = f8;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            } else {
                                f6 = f8;
                            }
                            f6 = (float) d;
                        }
                        int iM = m(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        v(i9, iMakeMeasureSpec, iM, viewE);
                        to0Var.i(i9, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, to0Var.d(viewE) + measuredHeight + flexItem.k() + flexItem.r());
                    aVar.e = measuredWidth + flexItem.n0() + flexItem.s0() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i9] >> 32);
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (this.b[i9] || flexItem.U() <= f) {
                        i5 = i5;
                        z3 = z4;
                    } else {
                        float fU2 = (flexItem.U() * f5) + measuredHeight3;
                        if (i7 == aVar.h - 1) {
                            fU2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fU2);
                        if (iRound2 > flexItem.u0()) {
                            iRound2 = flexItem.u0();
                            this.b[i9] = true;
                            aVar.j -= flexItem.U();
                            z3 = true;
                        } else {
                            float f9 = (fU2 - iRound2) + f6;
                            double d4 = f9;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                } else {
                                    f6 = f9;
                                }
                                z3 = z4;
                            }
                            f6 = (float) d2;
                            z3 = z4;
                        }
                        int iN = n(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewE.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        v(i9, iN, iMakeMeasureSpec2, viewE);
                        to0Var.i(i9, viewE);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, to0Var.d(viewE) + measuredWidth3 + flexItem.n0() + flexItem.s0());
                    aVar.e = measuredHeight3 + flexItem.k() + flexItem.r() + aVar.e;
                    f2 = f5;
                    z2 = z3;
                    i6 = i7;
                }
                aVar.g = Math.max(aVar.g, iMax);
                i8 = iMax;
            }
            i7 = i6 + 1;
            f5 = f2;
            f4 = f;
            i5 = i5;
            z4 = z2;
        }
        int i10 = i5;
        if (!z4 || i10 == aVar.e) {
            return;
        }
        l(i, i2, aVar, i3, i4, true);
    }

    public final int m(int i, FlexItem flexItem, int i2) {
        to0 to0Var = this.a;
        int iC = to0Var.c(i, to0Var.getPaddingBottom() + to0Var.getPaddingTop() + flexItem.k() + flexItem.r() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iC);
        if (size > flexItem.u0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.u0(), View.MeasureSpec.getMode(iC));
        }
        return size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(iC)) : iC;
    }

    public final int n(int i, FlexItem flexItem, int i2) {
        to0 to0Var = this.a;
        int iG = to0Var.g(i, to0Var.getPaddingRight() + to0Var.getPaddingLeft() + flexItem.n0() + flexItem.s0() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iG);
        if (size > flexItem.b0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.b0(), View.MeasureSpec.getMode(iG));
        }
        return size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(iG)) : iG;
    }

    public final void q(int i, int i2, a aVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int minWidth;
        int minHeight;
        int i5 = aVar.e;
        float f2 = aVar.k;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < aVar.h) {
            int i8 = aVar.o + i6;
            to0 to0Var = this.a;
            View viewE = to0Var.e(i8);
            if (viewE == null || viewE.getVisibility() == 8) {
                f = f3;
                f4 = f4;
            } else {
                FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                int flexDirection = to0Var.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f4;
                    int measuredWidth = viewE.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewE.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.b[i8] && flexItem.L() > f) {
                        float fL = measuredWidth - (f4 * flexItem.L());
                        if (i6 == aVar.h - 1) {
                            fL += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fL);
                        if (iRound < flexItem.getMinWidth()) {
                            minWidth = flexItem.getMinWidth();
                            this.b[i8] = true;
                            aVar.k -= flexItem.L();
                            z2 = true;
                        } else {
                            float f6 = (fL - iRound) + f5;
                            double d = f6;
                            if (d > 1.0d) {
                                minWidth = iRound + 1;
                                f6 -= 1.0f;
                            } else if (d < -1.0d) {
                                minWidth = iRound - 1;
                                f6 += 1.0f;
                            } else {
                                minWidth = iRound;
                            }
                            f5 = f6;
                        }
                        int iM = m(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(minWidth, 1073741824);
                        viewE.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewE.getMeasuredWidth();
                        int measuredHeight2 = viewE.getMeasuredHeight();
                        v(i8, iMakeMeasureSpec, iM, viewE);
                        to0Var.i(i8, viewE);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, to0Var.d(viewE) + measuredHeight + flexItem.k() + flexItem.r());
                    aVar.e = measuredWidth + flexItem.n0() + flexItem.s0() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewE.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewE.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.b[i8] || flexItem.L() <= f) {
                        f4 = f4;
                    } else {
                        float fL2 = measuredHeight3 - (flexItem.L() * f4);
                        if (i6 == aVar.h - 1) {
                            fL2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fL2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            minHeight = flexItem.getMinHeight();
                            this.b[i8] = true;
                            aVar.k -= flexItem.L();
                            z2 = true;
                        } else {
                            float f7 = (fL2 - iRound2) + f5;
                            double d2 = f7;
                            if (d2 > 1.0d) {
                                minHeight = iRound2 + 1;
                                f7 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                minHeight = iRound2 - 1;
                                f7 += 1.0f;
                            } else {
                                minHeight = iRound2;
                            }
                            f5 = f7;
                        }
                        int iN = n(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(minHeight, 1073741824);
                        viewE.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewE.getMeasuredWidth();
                        int measuredHeight4 = viewE.getMeasuredHeight();
                        v(i8, iN, iMakeMeasureSpec2, viewE);
                        to0Var.i(i8, viewE);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, to0Var.d(viewE) + measuredWidth3 + flexItem.n0() + flexItem.s0());
                    aVar.e = measuredHeight3 + flexItem.k() + flexItem.r() + aVar.e;
                }
                aVar.g = Math.max(aVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == aVar.e) {
            return;
        }
        q(i, i2, aVar, i3, i4, true);
    }

    public final void u(int i) {
        View viewE;
        to0 to0Var = this.a;
        if (i >= to0Var.getFlexItemCount()) {
            return;
        }
        int flexDirection = to0Var.getFlexDirection();
        if (to0Var.getAlignItems() != 4) {
            for (a aVar : to0Var.getFlexLinesInternal()) {
                ArrayList arrayList = aVar.n;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Integer num = (Integer) obj;
                    View viewE2 = to0Var.e(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(viewE2, aVar.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            defpackage.d.r(pv1.k(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        s(viewE2, aVar.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        List flexLinesInternal = to0Var.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i3 = iArr != null ? iArr[i] : 0; i3 < size2; i3++) {
            a aVar2 = (a) flexLinesInternal.get(i3);
            int i4 = aVar2.h;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = aVar2.o + i5;
                if (i5 < to0Var.getFlexItemCount() && (viewE = to0Var.e(i6)) != null && viewE.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewE.getLayoutParams();
                    if (flexItem.t() == -1 || flexItem.t() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(viewE, aVar2.g, i6);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                defpackage.d.r(pv1.k(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            s(viewE, aVar2.g, i6);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    public b(to0 to0Var) {
        this.a = to0Var;
    }

    public static int[] r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            vo0 vo0Var = (vo0) obj;
            int i4 = vo0Var.a;
            iArr[i2] = i4;
            sparseIntArray.append(i4, vo0Var.b);
            i2++;
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void c(int i, View view) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.getMinWidth()) {
            measuredWidth = flexItem.getMinWidth();
        } else {
            if (measuredWidth > flexItem.b0()) {
                measuredWidth = flexItem.b0();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.getMinHeight()) {
                measuredHeight = flexItem.getMinHeight();
            } else if (measuredHeight > flexItem.u0()) {
                measuredHeight = flexItem.u0();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                v(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.a.i(i, view);
            }
        }
        z = true;
        if (measuredHeight < flexItem.getMinHeight()) {
            measuredHeight = flexItem.getMinHeight();
        } else if (measuredHeight > flexItem.u0()) {
            measuredHeight = flexItem.u0();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            v(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.a.i(i, view);
        }
    }

    public final void o(View view, a aVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        to0 to0Var = this.a;
        int alignItems = to0Var.getAlignItems();
        if (flexItem.t() != -1) {
            alignItems = flexItem.t();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3) {
                        if (alignItems != 4) {
                            return;
                        }
                    } else {
                        int flexWrap = to0Var.getFlexWrap();
                        int i6 = aVar.l;
                        if (flexWrap != 2) {
                            int iMax = Math.max(i6 - view.getBaseline(), flexItem.k());
                            view.layout(i, i2 + iMax, i3, i4 + iMax);
                            return;
                        } else {
                            int iMax2 = Math.max(view.getBaseline() + (i6 - view.getMeasuredHeight()), flexItem.r());
                            view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                            return;
                        }
                    }
                } else {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.k()) - flexItem.r()) / 2;
                    if (to0Var.getFlexWrap() != 2) {
                        int i7 = i2 + measuredHeight;
                        view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                        return;
                    } else {
                        int i8 = i2 - measuredHeight;
                        view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                        return;
                    }
                }
            } else if (to0Var.getFlexWrap() != 2) {
                int i9 = i2 + i5;
                view.layout(i, (i9 - view.getMeasuredHeight()) - flexItem.r(), i3, i9 - flexItem.r());
                return;
            } else {
                view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.k(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.k());
                return;
            }
        }
        if (to0Var.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.k(), i3, i4 + flexItem.k());
        } else {
            view.layout(i, i2 - flexItem.r(), i3, i4 - flexItem.r());
        }
    }

    public final void p(View view, a aVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.t() != -1) {
            alignItems = flexItem.t();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        view.layout(i + marginStart, i2, i3 + marginStart, i4);
                        return;
                    } else {
                        view.layout(i - marginStart, i2, i3 - marginStart, i4);
                        return;
                    }
                }
            } else {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.s0(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.s0(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.n0(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.n0(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.n0(), i2, i3 + flexItem.n0(), i4);
        } else {
            view.layout(i - flexItem.s0(), i2, i3 - flexItem.s0(), i4);
        }
    }

    public final void s(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iN0 = (i - flexItem.n0()) - flexItem.s0();
        to0 to0Var = this.a;
        int iMin = Math.min(Math.max(iN0 - to0Var.d(view), flexItem.getMinWidth()), flexItem.b0());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i2] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        to0Var.i(i2, view);
    }

    public final void t(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iK = (i - flexItem.k()) - flexItem.r();
        to0 to0Var = this.a;
        int iMin = Math.min(Math.max(iK - to0Var.d(view), flexItem.getMinHeight()), flexItem.u0());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        to0Var.i(i2, view);
    }
}
