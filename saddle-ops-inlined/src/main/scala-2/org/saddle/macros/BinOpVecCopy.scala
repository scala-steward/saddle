package org.saddle.macros

import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpVecMacros.{vecScalarElementwise => make}
import org.saddle.Vec 

trait BinOpVecCopy {

  // basic operations
  implicit val vecSclr_Copy_DD_Add: BinOp[Add, Vec[Double], Double, Vec[Double]] = make[Double, Double, Double, Add]
  implicit val vecSclr_Copy_DL_Add: BinOp[Add, Vec[Double], Long, Vec[Double]] = make[Double, Long, Double, Add]
  implicit val vecSclr_Copy_DI_Add: BinOp[Add, Vec[Double], Int, Vec[Double]] = make[Double, Int, Double, Add]
  implicit val vecSclr_Copy_LL_Add: BinOp[Add, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, Add]
  implicit val vecSclr_Copy_LD_Add: BinOp[Add, Vec[Long], Double, Vec[Double]] = make[Long, Double, Double, Add]
  implicit val vecSclr_Copy_LI_Add: BinOp[Add, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, Add]
  implicit val vecSclr_Copy_IL_Add: BinOp[Add, Vec[Int], Long, Vec[Long]] = make[Int, Long, Long, Add]
  implicit val vecSclr_Copy_II_Add: BinOp[Add, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, Add]
  implicit val vecSclr_Copy_ID_Add: BinOp[Add, Vec[Int], Double, Vec[Double]] = make[Int, Double, Double, Add]

  implicit val vecSclr_Copy_DD_Power: BinOp[Power, Vec[Double], Double, Vec[Double]] = make[Double, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_Copy_DL_Power: BinOp[Power, Vec[Double], Long, Vec[Double]] = make[Double, Long, Double, Power]
  implicit val vecSclr_Copy_DI_Power: BinOp[Power, Vec[Double], Int, Vec[Double]] = make[Double, Int, Double, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_Copy_LL_Power: BinOp[Power, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_Copy_LD_Power: BinOp[Power, Vec[Long], Double, Vec[Double]] = make[Long, Double, Double, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_Copy_LI_Power: BinOp[Power, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_Copy_IL_Power: BinOp[Power, Vec[Int], Long, Vec[Long]] = make[Int, Long, Long, Power]
  implicit val vecSclr_Copy_II_Power: BinOp[Power, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, Power]
  implicit val vecSclr_Copy_ID_Power: BinOp[Power, Vec[Int], Double, Vec[Double]] = make[Int, Double, Double, Power]

  implicit val vecSclr_Copy_DD_Sub: BinOp[Subtract, Vec[Double], Double, Vec[Double]] = make[Double, Double, Double, Subtract]
  implicit val vecSclr_Copy_DL_Sub: BinOp[Subtract, Vec[Double], Long, Vec[Double]] = make[Double, Long, Double, Subtract]
  implicit val vecSclr_Copy_DI_Sub: BinOp[Subtract, Vec[Double], Int, Vec[Double]] = make[Double, Int, Double, Subtract]
  implicit val vecSclr_Copy_LL_Sub: BinOp[Subtract, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, Subtract]
  implicit val vecSclr_Copy_LD_Sub: BinOp[Subtract, Vec[Long], Double, Vec[Double]] = make[Long, Double, Double, Subtract]
  implicit val vecSclr_Copy_LI_Sub: BinOp[Subtract, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, Subtract]
  implicit val vecSclr_Copy_IL_Sub: BinOp[Subtract, Vec[Int], Long, Vec[Long]] = make[Int, Long, Long, Subtract]
  implicit val vecSclr_Copy_II_Sub: BinOp[Subtract, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, Subtract]
  implicit val vecSclr_Copy_ID_Sub: BinOp[Subtract, Vec[Int], Double, Vec[Double]] = make[Int, Double, Double, Subtract]

  implicit val vecSclr_Copy_DD_Mult: BinOp[Multiply, Vec[Double], Double, Vec[Double]] = make[Double, Double, Double, Multiply]
  implicit val vecSclr_Copy_DL_Mult: BinOp[Multiply, Vec[Double], Long, Vec[Double]] = make[Double, Long, Double, Multiply]
  implicit val vecSclr_Copy_DI_Mult: BinOp[Multiply, Vec[Double], Int, Vec[Double]] = make[Double, Int, Double, Multiply]
  implicit val vecSclr_Copy_LL_Mult: BinOp[Multiply, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, Multiply]
  implicit val vecSclr_Copy_LD_Mult: BinOp[Multiply, Vec[Long], Double, Vec[Double]] = make[Long, Double, Double, Multiply]
  implicit val vecSclr_Copy_LI_Mult: BinOp[Multiply, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, Multiply]
  implicit val vecSclr_Copy_IL_Mult: BinOp[Multiply, Vec[Int], Long, Vec[Long]] = make[Int, Long, Long, Multiply]
  implicit val vecSclr_Copy_II_Mult: BinOp[Multiply, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, Multiply]
  implicit val vecSclr_Copy_ID_Mult: BinOp[Multiply, Vec[Int], Double, Vec[Double]] = make[Int, Double, Double, Multiply]

  implicit val vecSclr_Copy_DD_Div: BinOp[Divide, Vec[Double], Double, Vec[Double]] = make[Double, Double, Double, Divide]
  implicit val vecSclr_Copy_DL_Div: BinOp[Divide, Vec[Double], Long, Vec[Double]] = make[Double, Long, Double, Divide]
  implicit val vecSclr_Copy_DI_Div: BinOp[Divide, Vec[Double], Int, Vec[Double]] = make[Double, Int, Double, Divide]
  implicit val vecSclr_Copy_LL_Div: BinOp[Divide, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, Divide]
  implicit val vecSclr_Copy_LD_Div: BinOp[Divide, Vec[Long], Double, Vec[Double]] = make[Long, Double, Double, Divide]
  implicit val vecSclr_Copy_LI_Div: BinOp[Divide, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, Divide]
  implicit val vecSclr_Copy_IL_Div: BinOp[Divide, Vec[Int], Long, Vec[Long]] = make[Int, Long, Long, Divide]
  implicit val vecSclr_Copy_II_Div: BinOp[Divide, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, Divide]
  implicit val vecSclr_Copy_ID_Div: BinOp[Divide, Vec[Int], Double, Vec[Double]] = make[Int, Double, Double, Divide]

  implicit val vecSclr_Copy_DD_Mod: BinOp[Mod, Vec[Double], Double, Vec[Double]] = make[Double, Double, Double, Mod]
  implicit val vecSclr_Copy_DL_Mod: BinOp[Mod, Vec[Double], Long, Vec[Double]] = make[Double, Long, Double, Mod]
  implicit val vecSclr_Copy_DI_Mod: BinOp[Mod, Vec[Double], Int, Vec[Double]] = make[Double, Int, Double, Mod]
  implicit val vecSclr_Copy_LL_Mod: BinOp[Mod, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, Mod]
  implicit val vecSclr_Copy_LD_Mod: BinOp[Mod, Vec[Long], Double, Vec[Double]] = make[Long, Double, Double, Mod]
  implicit val vecSclr_Copy_LI_Mod: BinOp[Mod, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, Mod]
  implicit val vecSclr_Copy_IL_Mod: BinOp[Mod, Vec[Int], Long, Vec[Long]] = make[Int, Long, Long, Mod]
  implicit val vecSclr_Copy_II_Mod: BinOp[Mod, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, Mod]
  implicit val vecSclr_Copy_ID_Mod: BinOp[Mod, Vec[Int], Double, Vec[Double]] = make[Int, Double, Double, Mod]

  // bitwise

  implicit val vecSclr_Copy_LL_BitAnd: BinOp[BitAnd, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, BitAnd]
  implicit val vecSclr_Copy_LI_BitAnd: BinOp[BitAnd, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, BitAnd]
  implicit val vecSclr_Copy_II_BitAnd: BinOp[BitAnd, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, BitAnd]

  implicit val vecSclr_Copy_LL_BitOr: BinOp[BitOr, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, BitOr]
  implicit val vecSclr_Copy_LI_BitOr: BinOp[BitOr, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, BitOr]
  implicit val vecSclr_Copy_II_BitOr: BinOp[BitOr, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, BitOr]

  implicit val vecSclr_Copy_LL_BitXor: BinOp[BitXor, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, BitXor]
  implicit val vecSclr_Copy_LI_BitXor: BinOp[BitXor, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, BitXor]
  implicit val vecSclr_Copy_II_BitXor: BinOp[BitXor, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, BitXor]

  implicit val vecSclr_Copy_LL_BitShl: BinOp[BitShl, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, BitShl]
  implicit val vecSclr_Copy_LI_BitShl: BinOp[BitShl, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, BitShl]
  implicit val vecSclr_Copy_II_BitShl: BinOp[BitShl, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, BitShl]

  implicit val vecSclr_Copy_LL_BitShr: BinOp[BitShr, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, BitShr]
  implicit val vecSclr_Copy_LI_BitShr: BinOp[BitShr, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, BitShr]
  implicit val vecSclr_Copy_II_BitShr: BinOp[BitShr, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, BitShr]

  implicit val vecSclr_Copy_LL_BitUshr: BinOp[BitUShr, Vec[Long], Long, Vec[Long]] = make[Long, Long, Long, BitUShr]
  implicit val vecSclr_Copy_LI_BitUshr: BinOp[BitUShr, Vec[Long], Int, Vec[Long]] = make[Long, Int, Long, BitUShr]
  implicit val vecSclr_Copy_II_BitUshr: BinOp[BitUShr, Vec[Int], Int, Vec[Int]] = make[Int, Int, Int, BitUShr]

  // comparison

  implicit val vecSclr_Copy_DD_GT: BinOp[GtOp, Vec[Double], Double, Vec[Boolean]] = make[Double, Double, Boolean, GtOp]
  implicit val vecSclr_Copy_DL_GT: BinOp[GtOp, Vec[Double], Long, Vec[Boolean]] = make[Double, Long, Boolean, GtOp]
  implicit val vecSclr_Copy_DI_GT: BinOp[GtOp, Vec[Double], Int, Vec[Boolean]] = make[Double, Int, Boolean, GtOp]
  implicit val vecSclr_Copy_LD_GT: BinOp[GtOp, Vec[Long], Double, Vec[Boolean]] = make[Long, Double, Boolean, GtOp]
  implicit val vecSclr_Copy_LL_GT: BinOp[GtOp, Vec[Long], Long, Vec[Boolean]] = make[Long, Long, Boolean, GtOp]
  implicit val vecSclr_Copy_LI_GT: BinOp[GtOp, Vec[Long], Int, Vec[Boolean]] = make[Long, Int, Boolean, GtOp]
  implicit val vecSclr_Copy_ID_GT: BinOp[GtOp, Vec[Int], Double, Vec[Boolean]] = make[Int, Double, Boolean, GtOp]
  implicit val vecSclr_Copy_II_GT: BinOp[GtOp, Vec[Int], Int, Vec[Boolean]] = make[Int, Int, Boolean, GtOp]
  implicit val vecSclr_Copy_BB_GT: BinOp[GtOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, GtOp]

  implicit val vecSclr_Copy_DD_GTE: BinOp[GteOp, Vec[Double], Double, Vec[Boolean]] = make[Double, Double, Boolean, GteOp]
  implicit val vecSclr_Copy_DL_GTE: BinOp[GteOp, Vec[Double], Long, Vec[Boolean]] = make[Double, Long, Boolean, GteOp]
  implicit val vecSclr_Copy_DI_GTE: BinOp[GteOp, Vec[Double], Int, Vec[Boolean]] = make[Double, Int, Boolean, GteOp]
  implicit val vecSclr_Copy_LD_GTE: BinOp[GteOp, Vec[Long], Double, Vec[Boolean]] = make[Long, Double, Boolean, GteOp]
  implicit val vecSclr_Copy_LL_GTE: BinOp[GteOp, Vec[Long], Long, Vec[Boolean]] = make[Long, Long, Boolean, GteOp]
  implicit val vecSclr_Copy_LI_GTE: BinOp[GteOp, Vec[Long], Int, Vec[Boolean]] = make[Long, Int, Boolean, GteOp]
  implicit val vecSclr_Copy_ID_GTE: BinOp[GteOp, Vec[Int], Double, Vec[Boolean]] = make[Int, Double, Boolean, GteOp]
  implicit val vecSclr_Copy_II_GTE: BinOp[GteOp, Vec[Int], Int, Vec[Boolean]] = make[Int, Int, Boolean, GteOp]
  implicit val vecSclr_Copy_BB_GTE: BinOp[GteOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, GteOp]

  implicit val vecSclr_Copy_DD_LT: BinOp[LtOp, Vec[Double], Double, Vec[Boolean]] = make[Double, Double, Boolean, LtOp]
  implicit val vecSclr_Copy_DL_LT: BinOp[LtOp, Vec[Double], Long, Vec[Boolean]] = make[Double, Long, Boolean, LtOp]
  implicit val vecSclr_Copy_DI_LT: BinOp[LtOp, Vec[Double], Int, Vec[Boolean]] = make[Double, Int, Boolean, LtOp]
  implicit val vecSclr_Copy_LD_LT: BinOp[LtOp, Vec[Long], Double, Vec[Boolean]] = make[Long, Double, Boolean, LtOp]
  implicit val vecSclr_Copy_LL_LT: BinOp[LtOp, Vec[Long], Long, Vec[Boolean]] = make[Long, Long, Boolean, LtOp]
  implicit val vecSclr_Copy_LI_LT: BinOp[LtOp, Vec[Long], Int, Vec[Boolean]] = make[Long, Int, Boolean, LtOp]
  implicit val vecSclr_Copy_ID_LT: BinOp[LtOp, Vec[Int], Double, Vec[Boolean]] = make[Int, Double, Boolean, LtOp]
  implicit val vecSclr_Copy_II_LT: BinOp[LtOp, Vec[Int], Int, Vec[Boolean]] = make[Int, Int, Boolean, LtOp]
  implicit val vecSclr_Copy_BB_LT: BinOp[LtOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, LtOp]

  implicit val vecSclr_Copy_DD_LTE: BinOp[LteOp, Vec[Double], Double, Vec[Boolean]] = make[Double, Double, Boolean, LteOp]
  implicit val vecSclr_Copy_DL_LTE: BinOp[LteOp, Vec[Double], Long, Vec[Boolean]] = make[Double, Long, Boolean, LteOp]
  implicit val vecSclr_Copy_DI_LTE: BinOp[LteOp, Vec[Double], Int, Vec[Boolean]] = make[Double, Int, Boolean, LteOp]
  implicit val vecSclr_Copy_LD_LTE: BinOp[LteOp, Vec[Long], Double, Vec[Boolean]] = make[Long, Double, Boolean, LteOp]
  implicit val vecSclr_Copy_LL_LTE: BinOp[LteOp, Vec[Long], Long, Vec[Boolean]] = make[Long, Long, Boolean, LteOp]
  implicit val vecSclr_Copy_LI_LTE: BinOp[LteOp, Vec[Long], Int, Vec[Boolean]] = make[Long, Int, Boolean, LteOp]
  implicit val vecSclr_Copy_ID_LTE: BinOp[LteOp, Vec[Int], Double, Vec[Boolean]] = make[Int, Double, Boolean, LteOp]
  implicit val vecSclr_Copy_II_LTE: BinOp[LteOp, Vec[Int], Int, Vec[Boolean]] = make[Int, Int, Boolean, LteOp]
  implicit val vecSclr_Copy_BB_LTE: BinOp[LteOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, LteOp]

  implicit val vecSclr_Copy_DD_NEQ: BinOp[NeqOp, Vec[Double], Double, Vec[Boolean]] = make[Double, Double, Boolean, NeqOp]
  implicit val vecSclr_Copy_DL_NEQ: BinOp[NeqOp, Vec[Double], Long, Vec[Boolean]] = make[Double, Long, Boolean, NeqOp]
  implicit val vecSclr_Copy_DI_NEQ: BinOp[NeqOp, Vec[Double], Int, Vec[Boolean]] = make[Double, Int, Boolean, NeqOp]
  implicit val vecSclr_Copy_LD_NEQ: BinOp[NeqOp, Vec[Long], Double, Vec[Boolean]] = make[Long, Double, Boolean, NeqOp]
  implicit val vecSclr_Copy_LL_NEQ: BinOp[NeqOp, Vec[Long], Long, Vec[Boolean]] = make[Long, Long, Boolean, NeqOp]
  implicit val vecSclr_Copy_LI_NEQ: BinOp[NeqOp, Vec[Long], Int, Vec[Boolean]] = make[Long, Int, Boolean, NeqOp]
  implicit val vecSclr_Copy_ID_NEQ: BinOp[NeqOp, Vec[Int], Double, Vec[Boolean]] = make[Int, Double, Boolean, NeqOp]
  implicit val vecSclr_Copy_II_NEQ: BinOp[NeqOp, Vec[Int], Int, Vec[Boolean]] = make[Int, Int, Boolean, NeqOp]
  implicit val vecSclr_Copy_BB_NEQ: BinOp[NeqOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, NeqOp]

  implicit val vecSclr_Copy_DD_EQ: BinOp[EqOp, Vec[Double], Double, Vec[Boolean]] = make[Double, Double, Boolean, EqOp]
  implicit val vecSclr_Copy_DL_EQ: BinOp[EqOp, Vec[Double], Long, Vec[Boolean]] = make[Double, Long, Boolean, EqOp]
  implicit val vecSclr_Copy_DI_EQ: BinOp[EqOp, Vec[Double], Int, Vec[Boolean]] = make[Double, Int, Boolean, EqOp]
  implicit val vecSclr_Copy_LD_EQ: BinOp[EqOp, Vec[Long], Double, Vec[Boolean]] = make[Long, Double, Boolean, EqOp]
  implicit val vecSclr_Copy_LL_EQ: BinOp[EqOp, Vec[Long], Long, Vec[Boolean]] = make[Long, Long, Boolean, EqOp]
  implicit val vecSclr_Copy_LI_EQ: BinOp[EqOp, Vec[Long], Int, Vec[Boolean]] = make[Long, Int, Boolean, EqOp]
  implicit val vecSclr_Copy_ID_EQ: BinOp[EqOp, Vec[Int], Double, Vec[Boolean]] = make[Int, Double, Boolean, EqOp]
  implicit val vecSclr_Copy_II_EQ: BinOp[EqOp, Vec[Int], Int, Vec[Boolean]] = make[Int, Int, Boolean, EqOp]
  implicit val vecSclr_Copy_BB_EQ: BinOp[EqOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, EqOp]

  // Boolean
  implicit val vecSclr_Copy_BB_And: BinOp[AndOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, AndOp]
  implicit val vecSclr_Copy_BB_Or: BinOp[OrOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, OrOp]
  implicit val vecSclr_Copy_BB_Xor: BinOp[XorOp, Vec[Boolean], Boolean, Vec[Boolean]] = make[Boolean, Boolean, Boolean, XorOp]

}
