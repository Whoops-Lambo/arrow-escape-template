package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class tu {
    public static final tu a;
    public static final HashMap b;
    public static final /* synthetic */ tu[] c;

    /* JADX INFO: Fake field, exist only in values array */
    tu EF0;

    static {
        tu tuVar = new tu("X86_32", 0);
        tu tuVar2 = new tu("X86_64", 1);
        tu tuVar3 = new tu("ARM_UNKNOWN", 2);
        tu tuVar4 = new tu("PPC", 3);
        tu tuVar5 = new tu("PPC64", 4);
        tu tuVar6 = new tu("ARMV6", 5);
        tu tuVar7 = new tu("ARMV7", 6);
        tu tuVar8 = new tu("UNKNOWN", 7);
        a = tuVar8;
        tu tuVar9 = new tu("ARMV7S", 8);
        tu tuVar10 = new tu("ARM64", 9);
        c = new tu[]{tuVar, tuVar2, tuVar3, tuVar4, tuVar5, tuVar6, tuVar7, tuVar8, tuVar9, tuVar10};
        HashMap map = new HashMap(4);
        b = map;
        map.put("armeabi-v7a", tuVar7);
        map.put("armeabi", tuVar6);
        map.put("arm64-v8a", tuVar10);
        map.put("x86", tuVar);
    }

    public static tu valueOf(String str) {
        return (tu) Enum.valueOf(tu.class, str);
    }

    public static tu[] values() {
        return (tu[]) c.clone();
    }
}
