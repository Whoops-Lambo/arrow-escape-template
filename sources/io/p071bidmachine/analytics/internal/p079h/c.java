package io.p071bidmachine.analytics.internal.p079h;

import defpackage.e80;
import defpackage.s71;
import io.p071bidmachine.analytics.ReaderConfig;
import io.p071bidmachine.analytics.internal.p078g.h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        private final ReaderConfig.Rule a;
        private final String b;
        private final h c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s71.b(this.a, aVar.a) && s71.b(this.b, aVar.b) && s71.b(this.c, aVar.c);
        }

        public /* synthetic */ a(ReaderConfig.Rule rule, String str, h hVar, int i, e80 e80Var) {
            this(rule, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : hVar);
        }

        public final String a() {
            return this.b;
        }

        public final h b() {
            return this.c;
        }

        public final ReaderConfig.Rule c() {
            return this.a;
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            h hVar = this.c;
            return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(rule=" + this.a + ", dataHash=" + this.b + ", error=" + this.c + ')';
        }

        public a(ReaderConfig.Rule rule, String str, h hVar) {
            this.a = rule;
            this.b = str;
            this.c = hVar;
        }
    }

    void a(List list);
}
