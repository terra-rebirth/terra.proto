//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun msgData(block: cosmos.base.abci.v1beta1.MsgDataKt.Dsl.() -> Unit): cosmos.base.abci.v1beta1.Abci.MsgData =
  cosmos.base.abci.v1beta1.MsgDataKt.Dsl._create(cosmos.base.abci.v1beta1.Abci.MsgData.newBuilder()).apply { block() }._build()
object MsgDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.base.abci.v1beta1.Abci.MsgData.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.abci.v1beta1.Abci.MsgData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.abci.v1beta1.Abci.MsgData = _builder.build()

    /**
     * <code>string msg_type = 1;</code>
     */
    var msgType: kotlin.String
      @JvmName("getMsgType")
      get() = _builder.getMsgType()
      @JvmName("setMsgType")
      set(value) {
        _builder.setMsgType(value)
      }
    /**
     * <code>string msg_type = 1;</code>
     */
    fun clearMsgType() {
      _builder.clearMsgType()
    }

    /**
     * <code>bytes data = 2;</code>
     */
    var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>bytes data = 2;</code>
     */
    fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.base.abci.v1beta1.Abci.MsgData.copy(block: cosmos.base.abci.v1beta1.MsgDataKt.Dsl.() -> Unit): cosmos.base.abci.v1beta1.Abci.MsgData =
  cosmos.base.abci.v1beta1.MsgDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()