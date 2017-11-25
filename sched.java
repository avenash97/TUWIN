/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author varsh
 */
import java.util.Random;
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class sched extends javax.swing.JInternalFrame {

    /**
     * Creates new form sched
     */
    int n,tq, at[], bt[], wt[], tat[],ct [],pt [],rt [],te [];
    int At[], Bt[], Wt[], Tat[],Ct [];
    float Avg_WT = 0;
    float Avg_TAT= 0;
    
    public sched() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        qw = new javax.swing.JTextField();
        c = new javax.swing.JTextField();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        f = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        h = new javax.swing.JTextField();
        z1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        abc = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Scheduling Algorithms");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText(" No. of Process:");

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("FCFS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("SJF");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("SRTF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Priority-N");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("Priority-P");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Time Quantum");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("RR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("SUBMIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        abc.setColumns(20);
        abc.setRows(5);
        jScrollPane1.setViewportView(abc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qw, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addComponent(jLabel3)
                            .addComponent(jButton2))
                        .addGap(156, 156, 156)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(qw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        n=Integer.parseInt(a.getText());
        Bt = new int[n];
        wt = new int[n];
        tat = new int[n];
        At = new int[n];
        ct=new int [n];

        //Enter Burst time
        for (int i = 0; i < n; i++)
        {
            Bt[i] = ThreadLocalRandom.current().nextInt(10);
        }

        //Enter Arrival time
        for (int j = 0; j < n; j++)
        {
            At[j] = ThreadLocalRandom.current().nextInt(10);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        bt = new int[n];
        wt = new int[n];
        tat = new int[n];
        at = new int[n];
        ct=new int [n];
        int temp;
        String text="";
        text=text.concat("PID         AT                BT\n");

        //Enter Burst time
        for (int i = 0; i < n; i++)
        {
            bt[i] = Bt[i];
            at[i] = At[i];

        }

        //Enter Arrival time
        /*for (int j = 0; j < n; j++)
        {
            at[j] = At[j];
        }*/

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(at[j]>at[j+1])
                {
                    temp=bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;

                    temp=at[i];
                    at[i]=at[j];
                    at[j]=temp;
                }
            }
        }
        int diff=0;
        wt[0] = 0;
        ct[0]= bt[0]+at[0];

        for (int x = 1; x < n; x++)
        {
            diff=0;
            if (at[x] < ct[x-1])
            ct[x]=ct[x-1]+ bt[x];		//completion Time
            else
            {
                diff=at[x] - ct[x-1];
                ct[x]=ct[x-1]+ bt[x]+diff;
            }
        }

        for (int y = 0; y< n; y++)
        {
            tat[y] = ct[y] - at[y];		//Turn Around Time
            Avg_TAT = Avg_TAT + tat[y];
        }

        for (int z = 0; z < n; z++)		//Waiting Time
        {
            wt[z]=tat[z]-bt[z];
            Avg_WT = Avg_WT + wt[z];
            text=text.concat(Integer.toString(z)+"               "+Integer.toString(At[z])+"                   "+Integer.toString(Bt[z])+"                   "+"\n");
        }

        float su=0;
        for( int i=0; i<n ;i++)
        {
            //System.out.print(wt[i]+" "+i+"\n");
            su+=wt[i];
        }
        qw.setText(" "+Double.toString(su/n));
        text=text.concat("\n\n");
        text=text.concat("Average Waiting Time: "+Double.toString(su/n)+"\n");
        abc.setText(text);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //     Random in=new Random();
        //int n=in.nextInt(10); 		//number of process
        //	System.out.println(n+"\n");
        int[] arrival = new int[1000];	//arrival time
        int[] burst = new int[1000];	//burst time
        int[] process = new int[1000];	//process ID
        int[][] wait= new int[20][100];	//waiting time
        int count=0;
        String text="";
        text=text.concat("PID         AT                BT\n");

        process[0]=0;
        arrival[0]=At[0];
        burst[0]=Bt[0];
        wait[0][1]=arrival[0];
        if(burst[0]==0)
        count++;
        //text=text.concat(Integer.toString(1)+"               "+Integer.toString(arrival[1])+"                   "+Integer.toString(burst[1])+"\n");
        for(int i=1;i<n;i++)
        {
            //randomNum1 = rand.nextInt(10);
            //randomNum2 = rand1.nextInt(10);
            process[i]=i;
            arrival[i]=At[i];
            wait[i][1]=arrival[i];
            burst[i]=Bt[i];
            if(burst[i]==0)
            count++;
            //text=text.concat(Integer.toString(i)+"               "+Integer.toString(arrival[i])+"                   "+Integer.toString(burst[i])+"\n");
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j <n; j++)
            {
                int tmp = 0,tmp1=0,temp2=0;
                if (burst[i] > burst[j])
                {
                    temp2=process[i];
                    process[i]=process[j];
                    process[j]=temp2;

                    tmp = burst[i];
                    burst[i] = burst[j];
                    burst[j] = tmp;

                    tmp1=arrival[i];
                    arrival[i]=arrival[j];
                    arrival[j]=tmp1;
                }
            }
        }
        int time=0;
        for (int j=0;j<n;j++)
        {
            wait[j][0]=0;
        }
        //System.out.println("hi\n");
        while(count<n)
        {
            int flag=1;
            for(int i=0;i<n;i++)
            {
                if(burst[i]!=0)
                {
                    if(arrival[i]<=time)
                    {
                        flag=0;
                        wait[process[i]][0]=wait[process[i]][0]+(time-wait[process[i]][1]);
                        time+=burst[i];
                        burst[i]-=burst[i];
                        if(burst[i]==0)
                        count++;
                        wait[process[i]][1]=time;	//completion time
                        break;
                    }

                }
            }
            if(flag==1)
            time++;

        }
        double sum=0;
        double result;
        for(int i=0;i<n;i++)
        {
            sum+=wait[i][0];
            text=text.concat(Integer.toString(i)+"               "+Integer.toString(At[i])+"                   "+Integer.toString(Bt[i])+"                   "+"\n");
        }
        result=(sum*1.0)/n;
        text=text.concat("\n\n");
        text=text.concat("Average Waiting Time: "+Double.toString(result)+"\n");
        abc.setText(text);;

        c.setText(" "+result);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int proc[][] = new int[n + 1][4];
        int a[][] = new int[n + 1][4];
        String text="";
        text=text.concat("PID         AT                BT\n");

        for(int i = 0; i < n; i++)
        {
            // Arrival Time for Process
            proc[i][0] = At[i];
            a[i][0] = proc[i][0];
        }
        for(int i = 0; i < n; i++)
        {
            // Burst Time for Process
            proc[i][1] = Bt[i];
            a[i][1] = proc[i][1];
        }

        int temp;
        int temp1;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j][0]>a[j+1][0])
                {
                    temp=a[j][0];
                    a[j][0]=a[j+1][0];
                    a[j+1][0]=temp;

                    temp1=a[j][1];
                    a[j][1]=a[j+1][1];
                    a[j+1][1]=temp1;
                }
            }
        }

        int total_time = a[1][1];
        for(int i = 1; i <= n; i++)
        {
            int diff=0;
            if(total_time<a[i][0])
            {
                diff=a[i][0]-total_time;
                //System.out.println(diff);
            }
            total_time=total_time+diff+a[i][1];
        }
        //System.out.println(total_time);

        int time_chart[] = new int[total_time];

        for(int i = 0; i < total_time; i++)
        {
            int sel_proc = 0;
            int min = 99999;

            for(int j = 1; j <= n; j++)
            {

                if(proc[j][0] <= i)
                {
                    if(proc[j][1] < min && proc[j][1] != 0)
                    {
                        min = proc[j][1];
                        sel_proc = j;
                    }
                }
            }

            time_chart[i] = sel_proc;
            proc[sel_proc][1]--;

            for(int j = 1; j <= n; j++)
            {
                if(proc[j][0] <= i)
                {
                    if(proc[j][1] != 0)
                    {
                        proc[j][3]++;
                        if(j != sel_proc)
                        proc[j][2]++;
                    }
                    else if(j == sel_proc)
                    proc[j][3]++;
                }
            }

            if(i != 0)
            {
                if(sel_proc != time_chart[i - 1])
                {
                    System.out.print("--" + i + "--P" + sel_proc);
                }
            }
            else
            System.out.print(i + "--P" + sel_proc );
            if(i == total_time - 1)
            System.out.print("--" + (i + 1) );

        }
        float WT = 0,TT = 0;
        for(int i = 0; i < n; i++)
        {
            WT += proc[i][2];
            text=text.concat(Integer.toString(i)+"               "+Integer.toString(At[i])+"                   "+Integer.toString(Bt[i])+"                   "+"\n");
            //TT += proc[i][3];
        }
        WT /= n;
        //TT /= n;
        d.setText(" "+WT);
        //System.out.println("The Average WT is: " + WT + "ms");
        text=text.concat("\n\n");
        text=text.concat("Average Waiting Time: "+Double.toString((WT))+"\n");
        abc.setText(text);;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //    Random in=new Random();
        //int n=in.nextInt(10); 		//number of process
        //	System.out.println(n+"\n");
        int[] arrival = new int[1000];	//arrival time
        int[] burst = new int[1000];	//burst time
        int[] process = new int[1000];	//process ID
        int[][] wait= new int[20][100];	//waiting time
        int[] priority=new int[1000];	//priority number
        int count=0;
        //	Random rand=new Random();
        //	Random rand1=new Random();
        Random rand3=new Random();
        String text="";
        text=text.concat("PID         AT                BT                PT                WT\n");

        int randomNum3 = rand3.nextInt(10);
        process[0]=0;
        arrival[0]=At[0];
        burst[0]=Bt[0];
        priority[0]=randomNum3;

        wait[0][1]=arrival[0];
        if(burst[0]==0)
        count++;
        //text=text.concat(Integer.toString(1)+"               "+Integer.toString(arrival[1])+"                   "+Integer.toString(burst[1])+"                    "+Integer.toString(priority[1])+"\n");

        for(int i=1;i<n;i++)
        {
            //randomNum1 = rand.nextInt(10);
            //randomNum2 = rand1.nextInt(10);
            randomNum3 = rand3.nextInt(10);
            process[i]=i;
            arrival[i]=At[i];
            wait[i][1]=arrival[i];
            burst[i]=Bt[i];
            priority[i]=randomNum3;
            if(burst[i]==0)
            count++;
            //	text=text.concat(Integer.toString(i)+"               "+Integer.toString(arrival[i])+"                   "+Integer.toString(burst[i])+"                      "+Integer.toString(priority[i])+"\n");
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j <n; j++)
            {
                int tmp = 0,tmp1=0,temp2=0,temp3=0;
                if (priority[i] > priority[j])
                {
                    temp2=process[i];
                    process[i]=process[j];
                    process[j]=temp2;

                    tmp = burst[i];
                    burst[i] = burst[j];
                    burst[j] = tmp;

                    tmp1=arrival[i];
                    arrival[i]=arrival[j];
                    arrival[j]=tmp1;

                    temp3=priority[i];
                    priority[i]=priority[j];
                    priority[j]=temp3;
                }
            }
        }

        int time=0;

        for (int j=0;j<n;j++)
        {

            wait[j][0]=0;
        }
        //        for(int i=0;i<n;i++)
        //	System.out.println(process[i] +"At[i]+ Bt[i] );
            while(count<n)
            {
                int flag=1;
                for(int i=0;i<n;i++)
                {
                    if(burst[i]!=0)
                    {
                        System.out.println(i);
                        if(arrival[i]<=time )
                        {
                            flag=0;
                            wait[process[i]][0]=wait[process[i]][0]+(time-wait[process[i]][1]);
                            time+=burst[i];
                            burst[i]-=burst[i];
                            if(burst[i]==0)
                            count++;
                            wait[process[i]][1]=time;
                            i=0;//completion time
                            break;
                        }
                    }
                }
                if(flag==1)
                time++;
            }
            double sum=0;
            double result;
            for(int i=0;i<n;i++)
            {
                sum+=wait[i][0];
                text=text.concat(Integer.toString(process[i])+"               "+Integer.toString(At[i])+"                   "+Integer.toString(Bt[i])+"                   "+Integer.toString(priority[i])+"                   "+Integer.toString(wait[i][0])+"\n");
            }
            result=(sum*1.0)/n;
            text=text.concat("\n\n");
            text=text.concat("Average Waiting Time: "+Double.toString(result)+"\n");
            abc.setText(text);
            e.setText(" "+result);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int  at[], bt[], wt[], tat[],ct [],pt [],temp,rt [];
        int sum_wait=0,sum_turnaround=0,smallest=0;
        //float Avg_WT = 0;
        //float Avg_TAT= 0;
        int diff=0;

        bt = new int[n];
        wt = new int[n];
        tat = new int[n];
        at = new int[n];
        ct =new int [n];
        pt =new int [n];
        rt =new int [n];

        String text="";
        text=text.concat("PID         AT                BT\n");
        // Burst time
        for (int i = 0; i < n; i++)
        {
            bt[i] = Bt[i];
        }

        // Arrival time
        for (int j = 0; j < n; j++)
        {
            at[j] = At[j];
        }

        // Priority
        //pt[0] = ThreadLocalRandom.current().nextInt(10);
        for (int k = 0; k < n; k++)
        {
            pt[k]=k;
        }

        for(int x=0;x<n;x++)
        {
            temp=ThreadLocalRandom.current().nextInt(n);
            int temp1;
            temp1=pt[temp];
            pt[temp]=pt[x];
            pt[x]=temp1;
        }
        int remain=n;
        for(int i=0;i<n;i++)
        {
            rt[i]=bt[i];
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(at[j]>at[j+1])
                {
                    temp=at[j];
                    at[j]=at[j+1];
                    at[j+1]=temp;

                    temp=bt[i];
                    bt[i]=bt[j];
                    bt[j]=temp;

                    temp=pt[i];
                    pt[i]=pt[j];
                    pt[j]=temp;
                }
            }
        }
        //pt[n-1]=11;
        for(int time=0;remain>=0;time++)
        {
            //System.out.println("*s");
            smallest=0;
            int min;
            for(int i=0;i<n;i++)
            {
                if(at[i]<=time && rt[i]>0)
                {
                    smallest=i;
                    min=pt[i];
                    for(int j=i+1;j<n;j++)
                    if( rt[j]>0 && at[j]<=time)
                    {
                        if(min>pt[j])
                        {
                            min=pt[j];
                            smallest=j;
                        }
                    }
                    break;
                }
            }
            if(rt[smallest]>0)
            rt[smallest]--;
            if(rt[smallest]==0)
            {
                remain--;
                sum_wait+=time+1-at[smallest];
                sum_turnaround+=time+1-at[smallest]-bt[smallest];
            }

        }
        for(int i=0;i<n;i++)
        {
            text=text.concat(Integer.toString(i)+"               "+Integer.toString(At[i])+"                   "+Integer.toString(Bt[i])+"                   "+"\n");
        }
        text=text.concat("\n\n");
        text=text.concat("Average Waiting Time: "+Double.toString((sum_wait*1.0/n))+"\n");
        abc.setText(text);
        //  System.out.println("Avg Waiting Time=" + (sum_wait*1.0/n) + "\n");

        f.setText(" "+(sum_wait*1.0/n));
        //System.out.println("Avg Waiting Time=" + (sum_wait*1.0/n) + "\n");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed

    }//GEN-LAST:event_cActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int i,j,cnt=0;
        int k,q,temp;
        float awt;
        bt = new int[n];
        wt = new int[n];
        tat = new int[n];
        at = new int[n];
        ct =new int [n];
        pt =new int [n];
        rt =new int [n];
        te =new int [n];

        String text="";
        text=text.concat("PID         AT                BT\n");
        // Burst time
        for ( i = 0; i < n; i++)
        {
            bt[i] = Bt[i];
            rt[i]=bt[i];
            wt[i]=0;
        }

        // Arrival time
        for ( j = 0; j < n; j++)
        {
            at[j] = At[j];
            te[j]=at[j];
        }

        for( i=0; i<n; i++)
        {
            for( j=0; j<n-i-1; j++)
            {
                if(at[j]>at[j+1])
                {
                    temp=at[j];
                    at[j]=at[j+1];
                    at[j+1]=temp;

                    temp=bt[j];
                    bt[j]=bt[j+1];
                    bt[j+1]=temp;

                    temp=rt[j];
                    rt[j]=rt[j+1];
                    rt[j+1]=temp;

                    temp=te[j];
                    te[j]=te[j+1];
                    te[j+1]=temp;
                }
            }
        }
        //System.out.println("Time Quantum");
        ////tq=reader.nextInt();

        q=0;
        //j=0;

        while(cnt<n)
        {
            //j++;
            int flag=1;
            for(i=0;i<n;i++)
            {
                if(rt[i]==0)
                {
                    continue;
                }
                else if(rt[i]>=tq  && at[i]<=q)
                {
                    wt[i]+=q-te[i];
                    q=q+tq;
                    rt[i]=rt[i]-tq;
                    te[i]=q;
                    if(rt[i]==0)
                    cnt++;
                    flag=0;
                }
                else if (rt[i]<tq  && at[i]<=q && rt[i]!=0)
                {
                    //wt[i]=q-te[i]*tq;
                    wt[i]=wt[i]+q-te[i];
                    q=q+rt[i];
                    te[i]=q;
                    //ct[i]=q; //completion time
                    rt[i]=rt[i]-rt[i];
                    cnt++;
                    flag=0;
                }
            }
            if(flag==1)
            q++;
        }

        awt=0;
        for(i=0;i<n;i++)
        {
            //tat[i]=ct[i]-at[i];
            //wt[i]=wt[i]-at[i];
            awt+=wt[i];
            text=text.concat(Integer.toString(i)+"               "+Integer.toString(At[i])+"                   "+Integer.toString(Bt[i])+"                   "+"\n");
            //System.out.println("Process " + i + "AT " + at[i] + "BT " + bt[i] + "CT " + ct[i] + "TAT " + tat[i]+ "WT" + wt[i]+"\n");
        }
        //System.out.println("Average Waiting Time" + (awt/n));
        text=text.concat("\n\n");
        text=text.concat("Average Waiting Time: "+Double.toString((awt/n))+"\n");
        abc.setText(text);;

        z1.setText(" "+(awt/n));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tq=Integer.parseInt(h.getText());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        home.jComboBox1.removeItem("Scheduling Algo");
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextArea abc;
    private javax.swing.JTextField c;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JTextField h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qw;
    private javax.swing.JTextField z1;
    // End of variables declaration//GEN-END:variables
}
