package com.nplit.vo;

public class Criteria {
   
   private int pageNum;
   private int amount;
   private int startNum;
   
   public Criteria() {
      //��ü ������ �⺻ ������ ȣ�� �� �Ű������� �༭ �Ű������� ������ �ִ� ������ �Լ� ȣ��
      this(1, 9);
   }
   
   public Criteria(int pageNum, int amount) {
      this.pageNum = pageNum;
      this.amount = amount;
   }

   public int getPageNum() {
      return pageNum;
   }

   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   public int getStartNum() {
      return startNum;
   }

   public void setStartNum(int startNum) {
      this.startNum = startNum;
   }

   @Override
   public String toString() {
      return "Criteria [pageNum=" + pageNum + ", amount=" + amount + "]";
   }
}