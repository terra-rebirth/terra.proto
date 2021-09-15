//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: ibc/applications/transfer/v1/transfer.proto

package ibc.applications.transfer.v1;

@kotlin.jvm.JvmSynthetic
inline fun params(block: ibc.applications.transfer.v1.ParamsKt.Dsl.() -> Unit): ibc.applications.transfer.v1.Transfer.Params =
  ibc.applications.transfer.v1.ParamsKt.Dsl._create(ibc.applications.transfer.v1.Transfer.Params.newBuilder()).apply { block() }._build()
object ParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: ibc.applications.transfer.v1.Transfer.Params.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: ibc.applications.transfer.v1.Transfer.Params.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): ibc.applications.transfer.v1.Transfer.Params = _builder.build()

    /**
     * <pre>
     * send_enabled enables or disables all cross-chain token transfers from this
     * chain.
     * </pre>
     *
     * <code>bool send_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"send_enabled&#92;""];</code>
     */
    var sendEnabled: kotlin.Boolean
      @JvmName("getSendEnabled")
      get() = _builder.getSendEnabled()
      @JvmName("setSendEnabled")
      set(value) {
        _builder.setSendEnabled(value)
      }
    /**
     * <pre>
     * send_enabled enables or disables all cross-chain token transfers from this
     * chain.
     * </pre>
     *
     * <code>bool send_enabled = 1 [(.gogoproto.moretags) = "yaml:&#92;"send_enabled&#92;""];</code>
     */
    fun clearSendEnabled() {
      _builder.clearSendEnabled()
    }

    /**
     * <pre>
     * receive_enabled enables or disables all cross-chain token transfers to this
     * chain.
     * </pre>
     *
     * <code>bool receive_enabled = 2 [(.gogoproto.moretags) = "yaml:&#92;"receive_enabled&#92;""];</code>
     */
    var receiveEnabled: kotlin.Boolean
      @JvmName("getReceiveEnabled")
      get() = _builder.getReceiveEnabled()
      @JvmName("setReceiveEnabled")
      set(value) {
        _builder.setReceiveEnabled(value)
      }
    /**
     * <pre>
     * receive_enabled enables or disables all cross-chain token transfers to this
     * chain.
     * </pre>
     *
     * <code>bool receive_enabled = 2 [(.gogoproto.moretags) = "yaml:&#92;"receive_enabled&#92;""];</code>
     */
    fun clearReceiveEnabled() {
      _builder.clearReceiveEnabled()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun ibc.applications.transfer.v1.Transfer.Params.copy(block: ibc.applications.transfer.v1.ParamsKt.Dsl.() -> Unit): ibc.applications.transfer.v1.Transfer.Params =
  ibc.applications.transfer.v1.ParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()