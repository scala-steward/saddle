package org.saddle.macros

import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpMatMacros.{matScalarElementwise => MatSclr}
import org.saddle.Mat

trait BinOpMatCopy {

  // basic operations
  implicit val matSclr_Copy_DD_Add: BinOp[Add, Mat[Double], Double, Mat[Double]] = MatSclr[Double, Double, Double, Add]
  implicit val matSclr_Copy_DL_Add: BinOp[Add, Mat[Double], Long, Mat[Double]] = MatSclr[Double, Long, Double, Add]
  implicit val matSclr_Copy_DI_Add: BinOp[Add, Mat[Double], Int, Mat[Double]] = MatSclr[Double, Int, Double, Add]
  implicit val matSclr_Copy_LL_Add: BinOp[Add, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, Add]
  implicit val matSclr_Copy_LD_Add: BinOp[Add, Mat[Long], Double, Mat[Double]] = MatSclr[Long, Double, Double, Add]
  implicit val matSclr_Copy_LI_Add: BinOp[Add, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, Add]
  implicit val matSclr_Copy_IL_Add: BinOp[Add, Mat[Int], Long, Mat[Long]] = MatSclr[Int, Long, Long, Add]
  implicit val matSclr_Copy_II_Add: BinOp[Add, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, Add]
  implicit val matSclr_Copy_ID_Add: BinOp[Add, Mat[Int], Double, Mat[Double]] = MatSclr[Int, Double, Double, Add]

  implicit val matSclr_Copy_DD_Power: BinOp[Power, Mat[Double], Double, Mat[Double]] = MatSclr[Double, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val matSclr_Copy_DL_Power: BinOp[Power, Mat[Double], Long, Mat[Double]] = MatSclr[Double, Long, Double, Power]
  implicit val matSclr_Copy_DI_Power: BinOp[Power, Mat[Double], Int, Mat[Double]] = MatSclr[Double, Int, Double, Power]
  @scala.annotation.nowarn
  implicit val matSclr_Copy_LL_Power: BinOp[Power, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, Power]
  @scala.annotation.nowarn
  implicit val matSclr_Copy_LD_Power: BinOp[Power, Mat[Long], Double, Mat[Double]] = MatSclr[Long, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val matSclr_Copy_LI_Power: BinOp[Power, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, Power]
  @scala.annotation.nowarn
  implicit val matSclr_Copy_IL_Power: BinOp[Power, Mat[Int], Long, Mat[Long]] = MatSclr[Int, Long, Long, Power]

  implicit val matSclr_Copy_II_Power: BinOp[Power, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, Power]
  implicit val matSclr_Copy_ID_Power: BinOp[Power, Mat[Int], Double, Mat[Double]] = MatSclr[Int, Double, Double, Power]

  implicit val matSclr_Copy_DD_Sub: BinOp[Subtract, Mat[Double], Double, Mat[Double]] = MatSclr[Double, Double, Double, Subtract]
  implicit val matSclr_Copy_DL_Sub: BinOp[Subtract, Mat[Double], Long, Mat[Double]] = MatSclr[Double, Long, Double, Subtract]
  implicit val matSclr_Copy_DI_Sub: BinOp[Subtract, Mat[Double], Int, Mat[Double]] = MatSclr[Double, Int, Double, Subtract]
  implicit val matSclr_Copy_LL_Sub: BinOp[Subtract, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, Subtract]
  implicit val matSclr_Copy_LD_Sub: BinOp[Subtract, Mat[Long], Double, Mat[Double]] = MatSclr[Long, Double, Double, Subtract]
  implicit val matSclr_Copy_LI_Sub: BinOp[Subtract, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, Subtract]
  implicit val matSclr_Copy_IL_Sub: BinOp[Subtract, Mat[Int], Long, Mat[Long]] = MatSclr[Int, Long, Long, Subtract]
  implicit val matSclr_Copy_II_Sub: BinOp[Subtract, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, Subtract]
  implicit val matSclr_Copy_ID_Sub: BinOp[Subtract, Mat[Int], Double, Mat[Double]] = MatSclr[Int, Double, Double, Subtract]

  implicit val matSclr_Copy_DD_Mult: BinOp[Multiply, Mat[Double], Double, Mat[Double]] = MatSclr[Double, Double, Double, Multiply]
  implicit val matSclr_Copy_DL_Mult: BinOp[Multiply, Mat[Double], Long, Mat[Double]] = MatSclr[Double, Long, Double, Multiply]
  implicit val matSclr_Copy_DI_Mult: BinOp[Multiply, Mat[Double], Int, Mat[Double]] = MatSclr[Double, Int, Double, Multiply]
  implicit val matSclr_Copy_LL_Mult: BinOp[Multiply, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, Multiply]
  implicit val matSclr_Copy_LD_Mult: BinOp[Multiply, Mat[Long], Double, Mat[Double]] = MatSclr[Long, Double, Double, Multiply]
  implicit val matSclr_Copy_LI_Mult: BinOp[Multiply, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, Multiply]
  implicit val matSclr_Copy_IL_Mult: BinOp[Multiply, Mat[Int], Long, Mat[Long]] = MatSclr[Int, Long, Long, Multiply]
  implicit val matSclr_Copy_II_Mult: BinOp[Multiply, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, Multiply]
  implicit val matSclr_Copy_ID_Mult: BinOp[Multiply, Mat[Int], Double, Mat[Double]] = MatSclr[Int, Double, Double, Multiply]

  implicit val matSclr_Copy_DD_Div: BinOp[Divide, Mat[Double], Double, Mat[Double]] = MatSclr[Double, Double, Double, Divide]
  implicit val matSclr_Copy_DL_Div: BinOp[Divide, Mat[Double], Long, Mat[Double]] = MatSclr[Double, Long, Double, Divide]
  implicit val matSclr_Copy_DI_Div: BinOp[Divide, Mat[Double], Int, Mat[Double]] = MatSclr[Double, Int, Double, Divide]
  implicit val matSclr_Copy_LL_Div: BinOp[Divide, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, Divide]
  implicit val matSclr_Copy_LD_Div: BinOp[Divide, Mat[Long], Double, Mat[Double]] = MatSclr[Long, Double, Double, Divide]
  implicit val matSclr_Copy_LI_Div: BinOp[Divide, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, Divide]
  implicit val matSclr_Copy_IL_Div: BinOp[Divide, Mat[Int], Long, Mat[Long]] = MatSclr[Int, Long, Long, Divide]
  implicit val matSclr_Copy_II_Div: BinOp[Divide, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, Divide]
  implicit val matSclr_Copy_ID_Div: BinOp[Divide, Mat[Int], Double, Mat[Double]] = MatSclr[Int, Double, Double, Divide]

  implicit val matSclr_Copy_DD_Mod: BinOp[Mod, Mat[Double], Double, Mat[Double]] = MatSclr[Double, Double, Double, Mod]
  implicit val matSclr_Copy_DL_Mod: BinOp[Mod, Mat[Double], Long, Mat[Double]] = MatSclr[Double, Long, Double, Mod]
  implicit val matSclr_Copy_DI_Mod: BinOp[Mod, Mat[Double], Int, Mat[Double]] = MatSclr[Double, Int, Double, Mod]
  implicit val matSclr_Copy_LL_Mod: BinOp[Mod, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, Mod]
  implicit val matSclr_Copy_LD_Mod: BinOp[Mod, Mat[Long], Double, Mat[Double]] = MatSclr[Long, Double, Double, Mod]
  implicit val matSclr_Copy_LI_Mod: BinOp[Mod, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, Mod]
  implicit val matSclr_Copy_IL_Mod: BinOp[Mod, Mat[Int], Long, Mat[Long]] = MatSclr[Int, Long, Long, Mod]
  implicit val matSclr_Copy_II_Mod: BinOp[Mod, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, Mod]
  implicit val matSclr_Copy_ID_Mod: BinOp[Mod, Mat[Int], Double, Mat[Double]] = MatSclr[Int, Double, Double, Mod]

  // bitwise

  implicit val matSclr_Copy_LL_BitAnd: BinOp[BitAnd, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, BitAnd]
  implicit val matSclr_Copy_LI_BitAnd: BinOp[BitAnd, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, BitAnd]
  implicit val matSclr_Copy_II_BitAnd: BinOp[BitAnd, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, BitAnd]

  implicit val matSclr_Copy_LL_BitOr: BinOp[BitOr, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, BitOr]
  implicit val matSclr_Copy_LI_BitOr: BinOp[BitOr, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, BitOr]
  implicit val matSclr_Copy_II_BitOr: BinOp[BitOr, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, BitOr]

  implicit val matSclr_Copy_LL_BitXor: BinOp[BitXor, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, BitXor]
  implicit val matSclr_Copy_LI_BitXor: BinOp[BitXor, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, BitXor]
  implicit val matSclr_Copy_II_BitXor: BinOp[BitXor, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, BitXor]

  implicit val matSclr_Copy_LL_BitShl: BinOp[BitShl, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, BitShl]
  implicit val matSclr_Copy_LI_BitShl: BinOp[BitShl, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, BitShl]
  implicit val matSclr_Copy_II_BitShl: BinOp[BitShl, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, BitShl]

  implicit val matSclr_Copy_LL_BitShr: BinOp[BitShr, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, BitShr]
  implicit val matSclr_Copy_LI_BitShr: BinOp[BitShr, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, BitShr]
  implicit val matSclr_Copy_II_BitShr: BinOp[BitShr, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, BitShr]

  implicit val matSclr_Copy_LL_BitUshr: BinOp[BitUShr, Mat[Long], Long, Mat[Long]] = MatSclr[Long, Long, Long, BitUShr]
  implicit val matSclr_Copy_LI_BitUshr: BinOp[BitUShr, Mat[Long], Int, Mat[Long]] = MatSclr[Long, Int, Long, BitUShr]
  implicit val matSclr_Copy_II_BitUshr: BinOp[BitUShr, Mat[Int], Int, Mat[Int]] = MatSclr[Int, Int, Int, BitUShr]

  // comparison

  implicit val matSclr_Copy_DD_GT: BinOp[GtOp, Mat[Double], Double, Mat[Boolean]] = MatSclr[Double, Double, Boolean, GtOp]
  implicit val matSclr_Copy_DL_GT: BinOp[GtOp, Mat[Double], Long, Mat[Boolean]] = MatSclr[Double, Long, Boolean, GtOp]
  implicit val matSclr_Copy_DI_GT: BinOp[GtOp, Mat[Double], Int, Mat[Boolean]] = MatSclr[Double, Int, Boolean, GtOp]
  implicit val matSclr_Copy_LD_GT: BinOp[GtOp, Mat[Long], Double, Mat[Boolean]] = MatSclr[Long, Double, Boolean, GtOp]
  implicit val matSclr_Copy_LL_GT: BinOp[GtOp, Mat[Long], Long, Mat[Boolean]] = MatSclr[Long, Long, Boolean, GtOp]
  implicit val matSclr_Copy_LI_GT: BinOp[GtOp, Mat[Long], Int, Mat[Boolean]] = MatSclr[Long, Int, Boolean, GtOp]
  implicit val matSclr_Copy_ID_GT: BinOp[GtOp, Mat[Int], Double, Mat[Boolean]] = MatSclr[Int, Double, Boolean, GtOp]
  implicit val matSclr_Copy_II_GT: BinOp[GtOp, Mat[Int], Int, Mat[Boolean]] = MatSclr[Int, Int, Boolean, GtOp]
  implicit val matSclr_Copy_BB_GT: BinOp[GtOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, GtOp]

  implicit val matSclr_Copy_DD_GTE: BinOp[GteOp, Mat[Double], Double, Mat[Boolean]] = MatSclr[Double, Double, Boolean, GteOp]
  implicit val matSclr_Copy_DL_GTE: BinOp[GteOp, Mat[Double], Long, Mat[Boolean]] = MatSclr[Double, Long, Boolean, GteOp]
  implicit val matSclr_Copy_DI_GTE: BinOp[GteOp, Mat[Double], Int, Mat[Boolean]] = MatSclr[Double, Int, Boolean, GteOp]
  implicit val matSclr_Copy_LD_GTE: BinOp[GteOp, Mat[Long], Double, Mat[Boolean]] = MatSclr[Long, Double, Boolean, GteOp]
  implicit val matSclr_Copy_LL_GTE: BinOp[GteOp, Mat[Long], Long, Mat[Boolean]] = MatSclr[Long, Long, Boolean, GteOp]
  implicit val matSclr_Copy_LI_GTE: BinOp[GteOp, Mat[Long], Int, Mat[Boolean]] = MatSclr[Long, Int, Boolean, GteOp]
  implicit val matSclr_Copy_ID_GTE: BinOp[GteOp, Mat[Int], Double, Mat[Boolean]] = MatSclr[Int, Double, Boolean, GteOp]
  implicit val matSclr_Copy_II_GTE: BinOp[GteOp, Mat[Int], Int, Mat[Boolean]] = MatSclr[Int, Int, Boolean, GteOp]
  implicit val matSclr_Copy_BB_GTE: BinOp[GteOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, GteOp]

  implicit val matSclr_Copy_DD_LT: BinOp[LtOp, Mat[Double], Double, Mat[Boolean]] = MatSclr[Double, Double, Boolean, LtOp]
  implicit val matSclr_Copy_DL_LT: BinOp[LtOp, Mat[Double], Long, Mat[Boolean]] = MatSclr[Double, Long, Boolean, LtOp]
  implicit val matSclr_Copy_DI_LT: BinOp[LtOp, Mat[Double], Int, Mat[Boolean]] = MatSclr[Double, Int, Boolean, LtOp]
  implicit val matSclr_Copy_LD_LT: BinOp[LtOp, Mat[Long], Double, Mat[Boolean]] = MatSclr[Long, Double, Boolean, LtOp]
  implicit val matSclr_Copy_LL_LT: BinOp[LtOp, Mat[Long], Long, Mat[Boolean]] = MatSclr[Long, Long, Boolean, LtOp]
  implicit val matSclr_Copy_LI_LT: BinOp[LtOp, Mat[Long], Int, Mat[Boolean]] = MatSclr[Long, Int, Boolean, LtOp]
  implicit val matSclr_Copy_ID_LT: BinOp[LtOp, Mat[Int], Double, Mat[Boolean]] = MatSclr[Int, Double, Boolean, LtOp]
  implicit val matSclr_Copy_II_LT: BinOp[LtOp, Mat[Int], Int, Mat[Boolean]] = MatSclr[Int, Int, Boolean, LtOp]
  implicit val matSclr_Copy_BB_LT: BinOp[LtOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, LtOp]

  implicit val matSclr_Copy_DD_LTE: BinOp[LteOp, Mat[Double], Double, Mat[Boolean]] = MatSclr[Double, Double, Boolean, LteOp]
  implicit val matSclr_Copy_DL_LTE: BinOp[LteOp, Mat[Double], Long, Mat[Boolean]] = MatSclr[Double, Long, Boolean, LteOp]
  implicit val matSclr_Copy_DI_LTE: BinOp[LteOp, Mat[Double], Int, Mat[Boolean]] = MatSclr[Double, Int, Boolean, LteOp]
  implicit val matSclr_Copy_LD_LTE: BinOp[LteOp, Mat[Long], Double, Mat[Boolean]] = MatSclr[Long, Double, Boolean, LteOp]
  implicit val matSclr_Copy_LL_LTE: BinOp[LteOp, Mat[Long], Long, Mat[Boolean]] = MatSclr[Long, Long, Boolean, LteOp]
  implicit val matSclr_Copy_LI_LTE: BinOp[LteOp, Mat[Long], Int, Mat[Boolean]] = MatSclr[Long, Int, Boolean, LteOp]
  implicit val matSclr_Copy_ID_LTE: BinOp[LteOp, Mat[Int], Double, Mat[Boolean]] = MatSclr[Int, Double, Boolean, LteOp]
  implicit val matSclr_Copy_II_LTE: BinOp[LteOp, Mat[Int], Int, Mat[Boolean]] = MatSclr[Int, Int, Boolean, LteOp]
  implicit val matSclr_Copy_BB_LTE: BinOp[LteOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, LteOp]

  implicit val matSclr_Copy_DD_NEQ: BinOp[NeqOp, Mat[Double], Double, Mat[Boolean]] = MatSclr[Double, Double, Boolean, NeqOp]
  implicit val matSclr_Copy_DL_NEQ: BinOp[NeqOp, Mat[Double], Long, Mat[Boolean]] = MatSclr[Double, Long, Boolean, NeqOp]
  implicit val matSclr_Copy_DI_NEQ: BinOp[NeqOp, Mat[Double], Int, Mat[Boolean]] = MatSclr[Double, Int, Boolean, NeqOp]
  implicit val matSclr_Copy_LD_NEQ: BinOp[NeqOp, Mat[Long], Double, Mat[Boolean]] = MatSclr[Long, Double, Boolean, NeqOp]
  implicit val matSclr_Copy_LL_NEQ: BinOp[NeqOp, Mat[Long], Long, Mat[Boolean]] = MatSclr[Long, Long, Boolean, NeqOp]
  implicit val matSclr_Copy_LI_NEQ: BinOp[NeqOp, Mat[Long], Int, Mat[Boolean]] = MatSclr[Long, Int, Boolean, NeqOp]
  implicit val matSclr_Copy_ID_NEQ: BinOp[NeqOp, Mat[Int], Double, Mat[Boolean]] = MatSclr[Int, Double, Boolean, NeqOp]
  implicit val matSclr_Copy_II_NEQ: BinOp[NeqOp, Mat[Int], Int, Mat[Boolean]] = MatSclr[Int, Int, Boolean, NeqOp]
  implicit val matSclr_Copy_BB_NEQ: BinOp[NeqOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, NeqOp]

  implicit val matSclr_Copy_DD_EQ: BinOp[EqOp, Mat[Double], Double, Mat[Boolean]] = MatSclr[Double, Double, Boolean, EqOp]
  implicit val matSclr_Copy_DL_EQ: BinOp[EqOp, Mat[Double], Long, Mat[Boolean]] = MatSclr[Double, Long, Boolean, EqOp]
  implicit val matSclr_Copy_DI_EQ: BinOp[EqOp, Mat[Double], Int, Mat[Boolean]] = MatSclr[Double, Int, Boolean, EqOp]
  implicit val matSclr_Copy_LD_EQ: BinOp[EqOp, Mat[Long], Double, Mat[Boolean]] = MatSclr[Long, Double, Boolean, EqOp]
  implicit val matSclr_Copy_LL_EQ: BinOp[EqOp, Mat[Long], Long, Mat[Boolean]] = MatSclr[Long, Long, Boolean, EqOp]
  implicit val matSclr_Copy_LI_EQ: BinOp[EqOp, Mat[Long], Int, Mat[Boolean]] = MatSclr[Long, Int, Boolean, EqOp]
  implicit val matSclr_Copy_ID_EQ: BinOp[EqOp, Mat[Int], Double, Mat[Boolean]] = MatSclr[Int, Double, Boolean, EqOp]
  implicit val matSclr_Copy_II_EQ: BinOp[EqOp, Mat[Int], Int, Mat[Boolean]] = MatSclr[Int, Int, Boolean, EqOp]
  implicit val matSclr_Copy_BB_EQ: BinOp[EqOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, EqOp]

  // Boolean
  implicit val matSclr_Copy_BB_And: BinOp[AndOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, AndOp]
  implicit val matSclr_Copy_BB_Or: BinOp[OrOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, OrOp]
  implicit val matSclr_Copy_BB_Xor: BinOp[XorOp, Mat[Boolean], Boolean, Mat[Boolean]] = MatSclr[Boolean, Boolean, Boolean, XorOp]

}
