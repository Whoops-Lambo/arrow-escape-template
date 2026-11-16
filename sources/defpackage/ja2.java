package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ja2 {
    public boolean a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;

    public static void b(ja2 ja2Var, KClass kClass, ay ayVar) {
        HashMap map = (HashMap) ja2Var.b;
        kClass.getClass();
        ay ayVar2 = (ay) map.get(kClass);
        if (ayVar2 != null && !ayVar2.equals(ayVar)) {
            throw new fa2("Contextual serializer or serializer provider for " + kClass + " already registered in this module");
        }
        map.put(kClass, ayVar);
        if (vk3.j(kClass).isInterface()) {
            ja2Var.a = true;
        }
    }

    public ja2() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public KSerializer a(KClass kClass, List list) {
        KSerializer kSerializerA;
        list.getClass();
        ay ayVar = (ay) this.b.get(kClass);
        if (ayVar != null) {
            kSerializerA = ayVar.a(list);
        } else {
            kSerializerA = null;
        }
        if (!(kSerializerA instanceof KSerializer)) {
            return null;
        }
        return kSerializerA;
    }

    public ja2(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.a = z;
    }
}
