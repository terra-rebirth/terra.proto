//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

@kotlin.jvm.JvmSynthetic
inline fun queryAllBalancesResponse(block: cosmos.bank.v1beta1.QueryAllBalancesResponseKt.Dsl.() -> Unit): cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse =
  cosmos.bank.v1beta1.QueryAllBalancesResponseKt.Dsl._create(cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.newBuilder()).apply { block() }._build()
object QueryAllBalancesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    @kotlin.jvm.JvmField private val _builder: cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class BalancesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * balances is the balances of all the coins.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
     val balances: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, BalancesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getBalancesList()
      )
    /**
     * <pre>
     * balances is the balances of all the coins.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The balances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addBalances")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, BalancesProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.addBalances(value)
    }/**
     * <pre>
     * balances is the balances of all the coins.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param value The balances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignBalances")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, BalancesProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      add(value)
    }/**
     * <pre>
     * balances is the balances of all the coins.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The balances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllBalances")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, BalancesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      _builder.addAllBalances(values)
    }/**
     * <pre>
     * balances is the balances of all the coins.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param values The balances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllBalances")
    inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, BalancesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.Coin>) {
      addAll(values)
    }/**
     * <pre>
     * balances is the balances of all the coins.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     * @param index The index to set the value at.
     * @param value The balances to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setBalances")
    operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, BalancesProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.Coin) {
      _builder.setBalances(index, value)
    }/**
     * <pre>
     * balances is the balances of all the coins.
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin balances = 1 [(.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearBalances")
    fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.Coin, BalancesProxy>.clear() {
      _builder.clearBalances()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     */
    fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2;</code>
     * @return Whether the pagination field is set.
     */
    fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse.copy(block: cosmos.bank.v1beta1.QueryAllBalancesResponseKt.Dsl.() -> Unit): cosmos.bank.v1beta1.QueryOuterClass.QueryAllBalancesResponse =
  cosmos.bank.v1beta1.QueryAllBalancesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()