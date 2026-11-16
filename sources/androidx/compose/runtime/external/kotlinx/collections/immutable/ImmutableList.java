package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import defpackage.bc1;
import defpackage.n1;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "SubList", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, bc1 {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList$SubList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Ln1;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SubList<E> extends n1 implements ImmutableList<E> {
        public final ImmutableList a;
        public final int b;
        public final int c;

        @Override // java.util.List
        public final Object get(int i) {
            ListImplementation.a(i, this.c);
            return this.a.get(this.b + i);
        }

        @Override // defpackage.i0
        /* JADX INFO: renamed from: getSize, reason: from getter */
        public final int getC() {
            return this.c;
        }

        @Override // defpackage.n1, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public final ImmutableList subList(int i, int i2) {
            ListImplementation.c(i, i2, this.c);
            int i3 = this.b;
            return new SubList(this.a, i + i3, i3 + i2);
        }

        public SubList(ImmutableList immutableList, int i, int i2) {
            this.a = immutableList;
            this.b = i;
            ListImplementation.c(i, i2, immutableList.size());
            this.c = i2 - i;
        }
    }

    @Override // java.util.List
    default ImmutableList subList(int i, int i2) {
        return new SubList(this, i, i2);
    }
}
