//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgDelegateResponse(block: cosmos.staking.v1beta1.MsgDelegateResponseKt.Dsl.() -> Unit): cosmos.staking.v1beta1.Tx.MsgDelegateResponse =
  cosmos.staking.v1beta1.MsgDelegateResponseKt.Dsl._create(cosmos.staking.v1beta1.Tx.MsgDelegateResponse.newBuilder()).apply { block() }._build()
object MsgDelegateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.staking.v1beta1.Tx.MsgDelegateResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Tx.MsgDelegateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Tx.MsgDelegateResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.staking.v1beta1.Tx.MsgDelegateResponse.copy(block: cosmos.staking.v1beta1.MsgDelegateResponseKt.Dsl.() -> Unit): cosmos.staking.v1beta1.Tx.MsgDelegateResponse =
  cosmos.staking.v1beta1.MsgDelegateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()