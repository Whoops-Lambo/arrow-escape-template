package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SemanticsPropertyKey<T> {
    public final String a;
    public final zr0 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public final class AnonymousClass1 extends rc1 implements zr0 {
        public static final AnonymousClass1 i = new AnonymousClass1(2);

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public final String toString() {
        return "SemanticsPropertyKey: " + this.a;
    }

    public SemanticsPropertyKey(String str, zr0 zr0Var) {
        zr0Var.getClass();
        this.a = str;
        this.b = zr0Var;
    }

    public final void a(SemanticsPropertyReceiver semanticsPropertyReceiver, KProperty kProperty, Object obj) {
        semanticsPropertyReceiver.getClass();
        kProperty.getClass();
        semanticsPropertyReceiver.a(this, obj);
    }

    public /* synthetic */ SemanticsPropertyKey(String str) {
        this(str, AnonymousClass1.i);
    }
}
