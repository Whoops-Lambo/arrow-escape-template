package com.explorestack.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v7 implements AbstractMessage.BuilderParent {
    public AbstractMessage.BuilderParent a;
    public AbstractMessage.Builder b;
    public AbstractMessage c;
    public boolean d;

    public final AbstractMessage a() {
        this.d = true;
        return d();
    }

    public final void b() {
        AbstractMessage abstractMessage = this.c;
        this.c = (AbstractMessage) (abstractMessage != null ? abstractMessage.getDefaultInstanceForType() : this.b.getDefaultInstanceForType());
        AbstractMessage.Builder builder = this.b;
        if (builder != null) {
            builder.dispose();
            this.b = null;
        }
        g();
    }

    public final AbstractMessage.Builder c() {
        if (this.b == null) {
            AbstractMessage.Builder builder = (AbstractMessage.Builder) this.c.newBuilderForType(this);
            this.b = builder;
            builder.mergeFrom((Message) this.c);
            this.b.markClean();
        }
        return this.b;
    }

    public final AbstractMessage d() {
        if (this.c == null) {
            this.c = (AbstractMessage) this.b.buildPartial();
        }
        return this.c;
    }

    public final MessageOrBuilder e() {
        AbstractMessage.Builder builder = this.b;
        return builder != null ? builder : this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public final void f(AbstractMessage abstractMessage) {
        if (this.b == null) {
            Message message = this.c;
            if (message == message.getDefaultInstanceForType()) {
                this.c = abstractMessage;
            } else {
                c().mergeFrom((Message) abstractMessage);
            }
        } else {
            c().mergeFrom((Message) abstractMessage);
        }
        g();
    }

    public final void g() {
        AbstractMessage.BuilderParent builderParent;
        if (this.b != null) {
            this.c = null;
        }
        if (!this.d || (builderParent = this.a) == null) {
            return;
        }
        builderParent.markDirty();
        this.d = false;
    }

    public final void h(AbstractMessage abstractMessage) {
        Charset charset = l5.a;
        abstractMessage.getClass();
        this.c = abstractMessage;
        AbstractMessage.Builder builder = this.b;
        if (builder != null) {
            builder.dispose();
            this.b = null;
        }
        g();
    }

    public v7(AbstractMessage abstractMessage, AbstractMessage.BuilderParent builderParent, boolean z) {
        Charset charset = l5.a;
        abstractMessage.getClass();
        this.c = abstractMessage;
        this.a = builderParent;
        this.d = z;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public final void markDirty() {
        g();
    }
}
