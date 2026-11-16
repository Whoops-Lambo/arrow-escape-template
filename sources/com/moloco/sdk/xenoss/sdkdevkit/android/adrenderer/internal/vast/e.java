package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import defpackage.as0;
import defpackage.az2;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements zr0 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.b()) {
                    composer.h();
                } else {
                    as0 as0Var = ComposerKt.a;
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer2.b()) {
                    composer2.h();
                } else {
                    as0 as0Var2 = ComposerKt.a;
                }
                break;
        }
        return az2Var;
    }
}
