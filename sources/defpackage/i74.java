package defpackage;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.games_v2.a;
import com.google.android.gms.internal.games_v2.zzhd;
import com.google.android.gms.internal.games_v2.zzhs;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i74 extends lb4 {
    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final List getImpliedScopes(Object obj) {
        Scope scope = new Scope(Scopes.GAMES);
        ur4 ur4Var = zzhd.b;
        Object[] objArr = {scope};
        zzhs.a(0, objArr[0]);
        return new a(objArr, 1);
    }
}
