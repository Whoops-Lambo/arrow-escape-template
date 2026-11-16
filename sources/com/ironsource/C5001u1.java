package com.ironsource;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import defpackage.az2;
import defpackage.dy;
import defpackage.j52;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5001u1 {

    /* JADX INFO: renamed from: com.ironsource.u1$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements OutcomeReceiver {
        final /* synthetic */ dy a;

        public a(dy dyVar) {
            this.a = dyVar;
        }

        public void onResult(Object obj) {
            this.a.resumeWith(az2.a);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            exc.getClass();
            this.a.resumeWith(new j52(exc));
        }
    }

    @RequiresApi
    @NotNull
    public static final OutcomeReceiver a(@NotNull dy dyVar) {
        dyVar.getClass();
        return new a(dyVar);
    }
}
