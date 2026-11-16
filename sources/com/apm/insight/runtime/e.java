package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class e {
    private static final e b = new e() { // from class: com.apm.insight.runtime.e.1
        private Header a = null;

        @Override // com.apm.insight.runtime.e
        @Nullable
        public final Object b(String str) {
            if (this.a == null) {
                this.a = Header.b(com.apm.insight.e.g());
            }
            return this.a.f().opt(str);
        }
    };
    private e a;

    public e() {
        this(b);
    }

    @Nullable
    public Object a(String str) {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.a = eVar;
    }
}
