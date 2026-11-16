package kotlin.reflect;

import defpackage.ks0;
import defpackage.wr0;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends ks0 implements wr0 {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.wr0
    public final String invoke(Type type) {
        type.getClass();
        return TypesJVMKt.typeToString(type);
    }
}
