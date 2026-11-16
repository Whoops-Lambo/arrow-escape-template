package androidx.transition;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import defpackage.h50;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class TransitionSet extends Transition {
    public int H;
    public ArrayList F = new ArrayList();
    public boolean G = true;
    public boolean I = false;
    public int J = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class TransitionSetListener extends TransitionListenerAdapter {
        public TransitionSet a;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
            TransitionSet transitionSet = this.a;
            if (transitionSet.I) {
                return;
            }
            transitionSet.M();
            transitionSet.I = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void j(Transition transition) {
            TransitionSet transitionSet = this.a;
            int i = transitionSet.H - 1;
            transitionSet.H = i;
            if (i == 0) {
                transitionSet.I = false;
                transitionSet.m();
            }
            transition.A(this);
        }
    }

    @Override // androidx.transition.Transition
    public final void B(View view) {
        for (int i = 0; i < this.F.size(); i++) {
            ((Transition) this.F.get(i)).B(view);
        }
        this.f.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void b(View view) {
        for (int i = 0; i < this.F.size(); i++) {
            ((Transition) this.F.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // androidx.transition.Transition
    public final boolean s() {
        for (int i = 0; i < this.F.size(); i++) {
            if (((Transition) this.F.get(i)).s()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final void D() {
        ArrayList arrayList;
        if (this.F.isEmpty()) {
            M();
            m();
            return;
        }
        TransitionSetListener transitionSetListener = new TransitionSetListener();
        transitionSetListener.a = this;
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((Transition) obj).a(transitionSetListener);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList3 = this.F;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((Transition) obj2).D();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.F.size();
            arrayList = this.F;
            if (i3 >= size3) {
                break;
            }
            Transition transition = (Transition) arrayList.get(i3 - 1);
            final Transition transition2 = (Transition) this.F.get(i3);
            transition.a(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void j(Transition transition3) {
                    transition2.D();
                    transition3.A(this);
                }
            });
            i3++;
        }
        Transition transition3 = (Transition) arrayList.get(0);
        if (transition3 != null) {
            transition3.D();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    public final void E(long j, long j2) {
        long j3;
        long j4 = this.y;
        long j5 = 0;
        if (this.i != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.r = false;
            x(this, Transition.TransitionNotification.a, z);
        }
        if (!this.G) {
            int size = 1;
            while (true) {
                int size2 = this.F.size();
                ArrayList arrayList = this.F;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((Transition) arrayList.get(size)).A > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.F.size()) {
                        Transition transition = (Transition) this.F.get(i);
                        long j6 = transition.A;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        transition.E(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    Transition transition2 = (Transition) this.F.get(i);
                    long j8 = transition2.A;
                    long j9 = j - j8;
                    transition2.E(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.i != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.r = true;
                }
                x(this, Transition.TransitionNotification.b, z);
            }
        }
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            ((Transition) this.F.get(i2)).E(j, j2);
        }
        j3 = j5;
        if (this.i != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.r = true;
            }
            x(this, Transition.TransitionNotification.b, z);
        }
    }

    @Override // androidx.transition.Transition
    public final void F(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.F.get(i)).F(j);
        }
    }

    @Override // androidx.transition.Transition
    public final void H(Transition.EpicenterCallback epicenterCallback) {
        this.w = epicenterCallback;
        this.J |= 8;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.F.get(i)).H(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public final void I(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.F.get(i)).I(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // androidx.transition.Transition
    public final void K(TransitionPropagation transitionPropagation) {
        this.v = transitionPropagation;
        this.J |= 2;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.F.get(i)).K(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public final void L(long j) {
        this.b = j;
    }

    public final void O(Transition transition) {
        this.F.add(transition);
        transition.i = this;
        long j = this.c;
        if (j >= 0) {
            transition.F(j);
        }
        if ((this.J & 1) != 0) {
            transition.I(this.d);
        }
        if ((this.J & 2) != 0) {
            transition.K(this.v);
        }
        if ((this.J & 4) != 0) {
            transition.J(this.x);
        }
        if ((this.J & 8) != 0) {
            transition.H(this.w);
        }
    }

    public final Transition P(int i) {
        if (i < 0 || i >= this.F.size()) {
            return null;
        }
        return (Transition) this.F.get(i);
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        View view = transitionValues.b;
        if (v(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Transition transition = (Transition) obj;
                if (transition.v(view)) {
                    transition.d(transitionValues);
                    transitionValues.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        View view = transitionValues.b;
        if (v(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Transition transition = (Transition) obj;
                if (transition.v(view)) {
                    transition.g(transitionValues);
                    transitionValues.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void l(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.F.get(i);
            if (j > 0 && (this.G || i == 0)) {
                long j2 = transition.b;
                if (j2 > 0) {
                    transition.L(j2 + j);
                } else {
                    transition.L(j);
                }
            }
            transition.l(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final boolean t() {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            if (!((Transition) this.F.get(i)).t()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public final void z() {
        this.y = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void k(Transition transition) {
                TransitionSet transitionSet = TransitionSet.this;
                transitionSet.F.remove(transition);
                if (transitionSet.s()) {
                    return;
                }
                transitionSet.x(transitionSet, Transition.TransitionNotification.c, false);
                transitionSet.r = true;
                transitionSet.x(transitionSet, Transition.TransitionNotification.b, false);
            }
        };
        for (int i = 0; i < this.F.size(); i++) {
            Transition transition = (Transition) this.F.get(i);
            transition.a(transitionListenerAdapter);
            transition.z();
            long j = transition.y;
            boolean z = this.G;
            long j2 = this.y;
            if (z) {
                this.y = Math.max(j2, j);
            } else {
                transition.A = j2;
                this.y = j2 + j;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition A(Transition.TransitionListener transitionListener) {
        super.A(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void C(View view) {
        super.C(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.F.get(i)).C(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void J(PathMotion pathMotion) {
        super.J(pathMotion);
        this.J |= 4;
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                ((Transition) this.F.get(i)).J(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final String N(String str) {
        String strN = super.N(str);
        for (int i = 0; i < this.F.size(); i++) {
            StringBuilder sbQ = h50.q(strN, "\n");
            sbQ.append(((Transition) this.F.get(i)).N(str.concat("  ")));
            strN = sbQ.toString();
        }
        return strN;
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.F.get(i)).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        super.f(transitionValues);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.F.get(i)).f(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: j */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.F = new ArrayList();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = ((Transition) this.F.get(i)).clone();
            transitionSet.F.add(transitionClone);
            transitionClone.i = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.F.get(i)).y(view);
        }
    }
}
