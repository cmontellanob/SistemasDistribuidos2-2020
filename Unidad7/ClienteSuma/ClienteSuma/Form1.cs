using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ClienteSuma
{
    public partial class frmSuma : Form
    {
        public frmSuma()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtB.Text);
            Servicio.wsAritmeticaSoapClient cliente = new Servicio.wsAritmeticaSoapClient();
            int resultado = cliente.Sumar(a, b);
            lblResultado.Text = resultado.ToString();
        }
    }
}
